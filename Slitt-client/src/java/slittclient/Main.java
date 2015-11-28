/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slittclient;

import Beans.FremgangBeanRemote;
import Beans.InnleveringBeanRemote;
import Beans.KalenderBeanRemote;
import Beans.ModulBeanRemote;
import Beans.TilbakemeldingBeanRemote;
import Beans.UserBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author Kenneth
 */
public class Main {
    @EJB (name = "TilbakemeldingBean")
    private static TilbakemeldingBeanRemote TilbakemeldingRemote;
    @EJB (name = "InnleveringBean")
    private static InnleveringBeanRemote InnleveringRemote;
    @EJB (name = "KalenderBean")
    private static KalenderBeanRemote KalenderRemote;
    @EJB (name = "ModulBean")
    private static ModulBeanRemote ModulRemote;
    @EJB(name = "FremgangBean")
    private static FremgangBeanRemote FremgangRemote;

    /**
     * @param args the command line arguments
     */
    @EJB(name = "UserBean")
    private static UserBeanRemote UserRemote;
    public static void main(String[] args) {
       // TestBeanHandler tHandler = new TestBeanHandler();
       // tHandler.printTest();
        
        String user = UserRemote.AddUser("Øystein", "Traskjær", 82937215, "Øystein@hotmail.com");
        System.out.print(user);
        
        String fremgang = FremgangRemote.Fremgang("Ikke Godkjent", "Masse Dårlig", "Gjorde det og det");
        System.out.print(fremgang);
        
        String modul = ModulRemote.Modul("Ressurs", "Masse kriterier", 2);
        System.out.print(modul);
        
        String kalender = KalenderRemote.Kalender("15.November",Boolean.FALSE, "Frist : 20.November");
        System.out.print(kalender);
        
        String innlevering = InnleveringRemote.Innlevering("Lastet opp","Veldig dårlig", "Modul.jar");
        System.out.print(innlevering);
        
        String tilbakemelding = TilbakemeldingRemote.Tilbakemelding("Ikke så bra jobbet","Modul trengs ditt og datt","Nei det var en setter", Boolean.FALSE);
        System.out.print(tilbakemelding);
        
    
        
        
                
                
    }
    
    public String addUser(String firstname, String lastname, int telephone, String mail){
        return UserRemote.AddUser(firstname, lastname, telephone, mail);
        
      
    }
    public boolean loginUser(String username, String password){
        return true;
    }
           
}

