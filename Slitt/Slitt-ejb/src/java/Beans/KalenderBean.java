/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Kalender;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kenneth
 */
@Stateless (name = "KalenderBean")
public class KalenderBean implements KalenderBeanRemote {
    
    @PersistenceContext
    EntityManager em;

    @Override
    public String Kalender(String Soke_Motetid, Boolean Godkjent_IkkeGodkjent, String ModulFrist) {
        Kalender u = new Kalender();
        u.setSoke_Motetid(Soke_Motetid);
        u.setGodkjent_IkkeGodkjent(Godkjent_IkkeGodkjent);
        u.setModulFrist(ModulFrist);
        em.persist(u);
        return u.getModulFrist();
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
