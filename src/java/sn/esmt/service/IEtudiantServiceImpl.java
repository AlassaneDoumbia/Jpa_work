package sn.esmt.service;

import java.util.List;

import sn.esmt.dao.EtudiantDaoImpl;
import sn.esmt.dao.IEtudiantDao;
import sn.esmt.domaine.Etudiant;

public class IEtudiantServiceImpl implements IEtudiantService{

	IEtudiantDao ied = new EtudiantDaoImpl();
	
	public IEtudiantServiceImpl(){
		
	}
	@Override
	public void addEtudiant(Etudiant e) {
            ied.addEtudiant(e);
		
	}

	@Override
	public Etudiant readEtudiant(Long id) {
		return ied.readEtudiant(id);
	}

	@Override
	public void deleteEtudiant(Long id) {
		ied.deleteEtudiant(id);
		
	}

	@Override
	public void updateEtudiant(Etudiant id) {
		ied.updateEtudiant(id);
	}

	@Override
	public List<Etudiant> listeEtudiant() {
		return ied.listeEtudiant();
	}
	@Override
	public String concatNom(Etudiant e) {
		return e.getPrenom()+" "+e.getNom();
	}
	
	

}
