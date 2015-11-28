/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.ejb.Remote;

/**
 *
 * @author Kenneth
 */
@Remote
public interface InnleveringBeanRemote {

    String Innlevering(String LastOpp, String Kommentar, String Vedlegg);
    
}
