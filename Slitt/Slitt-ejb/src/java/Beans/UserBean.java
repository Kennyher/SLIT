/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Bruker;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kenneth
 */
@Stateless(name = "UserBean")
public class UserBean implements UserBeanRemote {

    @PersistenceContext
    EntityManager em;

    @Override
    public String AddUser(String FirstName, String LastName, int TlfNr, String Email) {
        Bruker u = new Bruker();
        u.setFirstName(FirstName);
        u.setLastName(LastName);
        u.setTlfNr(TlfNr);
        u.setEmail(Email);
        em.persist(u);
        return u.getFirstName();

    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
