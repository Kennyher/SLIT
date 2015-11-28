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
public interface ModulBeanRemote {

    String Modul(String Ressurs, String Info_Kriterier, int ModulNr);
    
}
