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
public interface UserBeanRemote {

    public String AddUser(String FirstName, String LastName, int TlfNr, String Email);

    public void delete(String firstname);

    public boolean loggInn(String username, String password);

}
