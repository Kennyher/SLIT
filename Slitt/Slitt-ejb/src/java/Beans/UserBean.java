/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Bruker;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
    
    //@Override
    //public void delete(String firstname) {
    //    TypedQuery<Bruker> q = em.createNamedQuery("Bruker.byFirstname", Bruker.class);
    //    q.setParameter("firstname", firstname);
    //    List<Bruker> ls = q.getResultList();
    //    if (ls.size() == 1) delete(ls.get(0));
    //}
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
