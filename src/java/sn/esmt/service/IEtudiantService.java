package sn.esmt.service;

import java.util.List;

import sn.esmt.domaine.Etudiant;

public interface IEtudiantService {

	
	public void addEtudiant(Etudiant e);
	public Etudiant readEtudiant(Long id);
	public void deleteEtudiant(Long id);
	public void updateEtudiant(Etudiant e);
	public List<Etudiant> listeEtudiant();
	public String concatNom(Etudiant e);
}
