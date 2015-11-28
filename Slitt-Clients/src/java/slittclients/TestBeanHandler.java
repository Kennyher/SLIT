/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slittclients;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import testBean.testBeanRemote;

/**
 *
 * @author Kenneth
 */
public class TestBeanHandler {

    private testBeanRemote lookuptestBeanRemote() {
        try {
            Context c = new InitialContext();
            return (testBeanRemote) c.lookup("java:global/Slitt-ejb/testBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
            
        }
    }
    public void printTest(){
        System.out.println(lookuptestBeanRemote().businessMethod());
    }
    
}
