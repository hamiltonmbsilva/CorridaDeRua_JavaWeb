/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.model.dao.imp;


import br.eventoEsportivo.model.classe.Usuario;
import br.eventoEsportivo.model.dao.DaoGeneric;
import br.eventoEsportivo.util.Crypto;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

/**
 *
 * @author Hamilton
 */
public class UsuarioDao extends DaoGeneric<Usuario, Integer>{
    
     public Usuario findByLoginAndSenha(String login, String senha){
        connection();
        Query q = em.createQuery("select u from Usuario u "
                + "where u.login = :l and u.senha = :s");
        q.setParameter("l", login);
        q.setParameter("s", Crypto.md5(senha));
        
        try {
            return (Usuario) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }catch(NonUniqueResultException e ){
            return null;
        }finally{
            close();
        }      
    }

    @Override
    public Usuario save(Usuario obj) {
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
    public Usuario delete(Usuario obj) {
         connection();        
        try {            
            em.getTransaction().begin();
            obj = em.getReference(Usuario.class, obj.getIdusuario());
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
    public Usuario edit(Usuario obj) {
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
    public Usuario findById(Integer idx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
