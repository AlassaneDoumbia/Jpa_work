package sn.esmt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sn.esmt.domaine.Etudiant;

public class EtudiantDaoImpl  implements IEtudiantDao{

	//Ouverture d'une entit� de travail JPA
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence");;
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction tx = em.getTransaction();
	public EtudiantDaoImpl() {
		
	}
	@Override
	public void addEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		tx.begin();
		
		//Persistance des objets en base
		em.persist(etudiant);
		
		//Fermeture 
		tx.commit();
	}
	@Override
	public Etudiant readEtudiant(Long id) {
		// TODO Auto-generated method stub
		tx.begin();
		Etudiant e = em.find(Etudiant.class, id);
		tx.commit();
		em.close();
		emf.close();
		return e;
	}
	@Override
	public void deleteEtudiant(Long id) {
		// TODO Auto-generated method stub
		tx.begin();
		em.remove(em.find(Etudiant.class, id));
		tx.commit();
		em.close();
		emf.close();
	}
	@Override
	public void updateEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		tx.begin();
		em.merge(etudiant);
		tx.commit();
		em.close();
		emf.close();
	}
	@Override
	public List<Etudiant> listeEtudiant() {
		tx.begin();
		Query query = em.createQuery("FROM Etudiant");
                //return (User) em.createQuery("FROM User u WHERE  u.email = :email").setParameter(email, "Not Found");
		List<Etudiant> etu = (List<Etudiant>)query.getResultList();
		tx.commit();
		em.close();
		emf.close();
		return etu;
	}
	
}
