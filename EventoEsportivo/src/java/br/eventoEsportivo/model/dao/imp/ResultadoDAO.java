/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.model.dao.imp;

import br.eventoEsportivo.model.classe.Resultado;
import br.eventoEsportivo.model.dao.DaoGeneric;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Hamilton
 */
public class ResultadoDAO extends DaoGeneric<Resultado, Integer>{

    @Override
    public Resultado save(Resultado obj) {
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
    public Resultado delete(Resultado obj) {
           connection();        
        try {            
            em.getTransaction().begin();
            obj = em.getReference(Resultado.class, obj.getIdresultado());
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
    public Resultado edit(Resultado obj) {
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
    public Resultado findById(Integer idx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Resultado> findAll() {
           connection();
        try {
            Query q = em.createNamedQuery("Resultado.findAll");
            return q.getResultList();
        } finally {
            close();
        }
    }
    
}
