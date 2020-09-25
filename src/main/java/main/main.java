/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mibsen
 */
public class main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        Person p1 = new Person("per","person","2323");
        try {
            em.getTransaction().begin();
            
            em.persist(new Person("per1","person","2323"));
            em.persist(new Person("per2","person","2323"));
            em.persist(new Person("per3","person","2323"));
            em.persist(new Person("per4","person","2323"));
            em.persist(new Person("per5","person","2323"));
            em.persist(new Person("per6","person","2323"));
            
            em.getTransaction().commit();
            
        } finally {
            em.close();
        }
        
        
    }
}
