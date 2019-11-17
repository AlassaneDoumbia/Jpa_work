package sn.esmt.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	
	@ManyToOne
	private Ecole ecole;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
