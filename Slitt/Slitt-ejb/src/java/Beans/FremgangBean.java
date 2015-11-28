/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Fremgang;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kenneth
 */
@Stateless (name = "FremgangBean")
public class FremgangBean implements FremgangBeanRemote {
    
    @PersistenceContext
    EntityManager em;

    @Override
    public String Fremgang(String Status, String Oversikt, String Logg) {
        Fremgang u = new Fremgang();
        u.setStatus(Status);
        u.setOversikt(Oversikt);
        u.setLogg(Logg);
        em.persist(u);
        return u.getStatus();
        
        
        
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
