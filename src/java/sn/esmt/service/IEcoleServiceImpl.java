package sn.esmt.service;

import java.util.List;
import sn.esmt.dao.EcoleDaoImpl;
import sn.esmt.dao.IEcoleDao;
import sn.esmt.domaine.Ecole;
import sn.esmt.domaine.Etudiant;


public class IEcoleServiceImpl implements IEcoleService{
    
    IEcoleDao ied = new EcoleDaoImpl(); 

    @Override
    public void addEcole(Ecole e) {
        ied.addEcole(e);
    }

    @Override
    public Ecole readEcole(Long id) {
        return ied.readEcole(id);
    }

    @Override
    public void deleteEcole(Long id) {
        ied.deleteEcole(id);
    }

    @Override
    public void updateEcole(Ecole e) {
        ied.updateEcole(e);
    }

    @Override
    public List<Ecole> listeEcole() {
        return ied.listeEcole();
    }

    @Override
    public String concatNom(Ecole e) {
        return e.getNom();
    }

    
    
}
