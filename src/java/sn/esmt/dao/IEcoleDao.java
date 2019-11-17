/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esmt.dao;

import java.util.List;
import sn.esmt.domaine.Ecole;

/**
 *
 * @author TOSHIBA
 */
public interface IEcoleDao {
    public void addEcole(Ecole e);
    public Ecole readEcole(Long id);
    public void deleteEcole(Long id);
    public void updateEcole(Ecole id);
    public List<Ecole> listeEcole();
}
