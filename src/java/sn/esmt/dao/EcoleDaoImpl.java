/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esmt.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sn.esmt.domaine.Ecole;

/**
 *
 * @author TOSHIBA
 */
public class EcoleDaoImpl implements IEcoleDao{

    //Ouverture d'une entit� de travail JPA
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence");;
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();
	
    @Override
    public void addEcole(Ecole e) {
        // TODO Auto-generated method stub
        tx.begin();

        //Persistance des objets en base
        em.persist(e);

        //Fermeture 
        tx.commit();
    }

    @Override
    public Ecole readEcole(Long id) {
        tx.begin();
        Ecole e = em.find(Ecole.class, id);
        tx.commit();
        em.close();
        emf.close();
        return e;
    }

    @Override
    public void deleteEcole(Long id) {
        // TODO Auto-generated method stub
        tx.begin();
        em.remove(em.find(Ecole.class, id));
        tx.commit();
        em.close();
        emf.close();
    }

    @Override
    public void updateEcole(Ecole id) {
        // TODO Auto-generated method stub
        tx.begin();
        em.merge(em.find(Ecole.class, id));
        tx.commit();
        em.close();
        emf.close();
    }

    @Override
    public List<Ecole> listeEcole() {
        tx.begin();
        Query query = em.createQuery("FROM Ecole");
        List<Ecole> etu = (List<Ecole>)query.getResultList();
        tx.commit();
        em.close();
        emf.close();
        return etu;
    }
    
}
