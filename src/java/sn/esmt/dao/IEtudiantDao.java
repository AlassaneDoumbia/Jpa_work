package sn.esmt.dao;

import java.util.List;

import sn.esmt.domaine.Etudiant;

public interface IEtudiantDao {

	public void addEtudiant(Etudiant etudiant);
	public Etudiant readEtudiant(Long id);
	public void deleteEtudiant(Long id);
	public void updateEtudiant(Etudiant id);
	public List<Etudiant> listeEtudiant();
}
