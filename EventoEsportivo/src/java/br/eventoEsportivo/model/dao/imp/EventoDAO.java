/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.model.dao.imp;

import br.eventoEsportivo.model.classe.Evento;
import br.eventoEsportivo.model.classe.Usuario;
import br.eventoEsportivo.model.dao.DaoGeneric;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Hamilton
 */
public class EventoDAO extends DaoGeneric<Evento, Integer>{
    
     public List<Evento> pesquisaMeusEventos(Usuario user, Date dataInicio, Date dataFim){
        connection();
        try {
            Query q = em.createQuery("select e from Evento e where "
                    + " e.usuario.idusuario = :idp and e.eventodata >= :dt1 and "
                    + " e.dataEvento <= :dt2");
            q.setParameter("idp", user.getIdusuario());
            q.setParameter("dt1", dataInicio);
            q.setParameter("dt2", dataFim);
            return q.getResultList();
        } finally {
            close();
        }
    }    
    
    public List<Evento> meusEventos(Usuario user){
        connection();
        try {
            Query q = em.createQuery("select e from Evento e where "
                    + " e.usuario.idusuario = :idp");
            q.setParameter("idp", user.getIdusuario());
            return q.getResultList();
        } finally {
            close();
        }
    }  

    @Override
    public Evento save(Evento obj) {
        connection();
        try {
             em.getTransaction().begin();
             em.persist(obj);
             em.getTransaction().commit();
             return obj;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return null;
        } finally{
            em.close();
        }
    }

    @Override
    public Evento delete(Evento obj) {
       connection();        
        try {            
            em.getTransaction().begin();
            obj = em.getReference(Evento.class, obj.getIdevento());
            em.remove(obj);
            em.getTransaction().commit();
            return obj;
        } catch (Exception e){ 
            em.getTransaction().rollback();
            return null;
        }finally {
            em.close();
        }
    }

    @Override
    public Evento edit(Evento obj) {
        connection();        
        try {            
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            return obj;
        } catch (Exception e){ 
            em.getTransaction().rollback();
            return null;
        }finally {
            em.close();
        }
    }

    @Override
    public Evento findById(Integer idx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> findAll() {
        connection();
        try {
            Query q = em.createNamedQuery("Evento.findAll");
            return q.getResultList();
        } finally {
            close();
        }
    }
    
}
