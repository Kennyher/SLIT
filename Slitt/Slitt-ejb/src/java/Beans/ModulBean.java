/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Modul;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kenneth
 */
@Stateless (name = "ModulBean")
public class ModulBean implements ModulBeanRemote {
    
    @PersistenceContext
    EntityManager em;
            
    @Override
    public String Modul(String Ressurs, String Info_Kriterier, int ModulNr) {
        Modul u = new Modul();
        u.setRessurs(Ressurs);
        u.setInfo_Kriterier(Info_Kriterier);
        u.setModulNr(ModulNr);
        em.persist(u);
        return u.getRessurs();
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
