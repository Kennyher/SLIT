/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Innlevering;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kenneth
 */
@Stateless (name = "InnleveringBean")
public class InnleveringBean implements InnleveringBeanRemote {
        
        @PersistenceContext
        EntityManager em;

    @Override
    public String Innlevering(String LastOpp, String Kommentar, String Vedlegg) {
        Innlevering u = new Innlevering();
        u.setLastOpp(LastOpp);
        u.setKommentar(Kommentar);
        u.setVedlegg(Vedlegg);
        em.persist(u);
        return u.getKommentar();
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
