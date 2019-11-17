package sn.esmt.service;

import java.util.List;
import sn.esmt.domaine.Ecole;

public interface IEcoleService {
    
    public void addEcole(Ecole e);
    public Ecole readEcole(Long id);
    public void deleteEcole(Long id);
    public void updateEcole(Ecole e);
    public List<Ecole> listeEcole();
    public String concatNom(Ecole e);
}
