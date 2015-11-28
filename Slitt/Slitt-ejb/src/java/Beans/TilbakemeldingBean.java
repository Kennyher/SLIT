/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Tilbakemelding;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kenneth
 */
@Stateless (name = "TilbakemeldingBean")
public class TilbakemeldingBean implements TilbakemeldingBeanRemote {
    
    @PersistenceContext
    EntityManager em;

    @Override
    public String Tilbakemelding(String Kommentar, String ModulTilbakemelding, String SvarPaaSpm, Boolean Godkjenning) {
       Tilbakemelding u = new Tilbakemelding();
       u.setKommentar(Kommentar);
       u.setModulTilbakemelding(ModulTilbakemelding);
       u.setSvarPaaSpm(SvarPaaSpm);
       u.setGodkjenning(Godkjenning);
       em.persist(u);
       return u.getModulTilbakemelding();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
