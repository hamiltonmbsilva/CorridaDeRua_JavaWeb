/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corridaRustica.evento.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hamilton
 */
public abstract class DaoGeneric <O, I>{

      private EntityManagerFactory emf;
      protected EntityManager em;

  public void connection(){
        emf = Persistence.createEntityManagerFactory("CorridaRusticaPU");
        em = emf.createEntityManager();
    }
  
  public void close(){
        if(em.isOpen()){
            em.close();
        }
        if(emf.isOpen()){
            emf.close();
        }
    }
    
    public abstract O save(O obj);
    public abstract O delete(O obj);
    public abstract O edit(O obj);
    public abstract O findById(I idx);
    public abstract List<O> findAll();
    
}



