package sn.esmt.domaine;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ecole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	
	@OneToMany
	private List<Etudiant> liste;
	
	
	public Ecole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Etudiant> getListe() {
		return liste;
	}


	public void setListe(List<Etudiant> liste) {
		this.liste = liste;
	}


	public Ecole(String nom) {
		super();
		this.nom = nom;
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
	
	
}
