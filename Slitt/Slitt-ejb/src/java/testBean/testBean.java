/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testBean;

import javax.ejb.Stateless;

/**
 *
 * @author Kenneth
 */
@Stateless
public class testBean implements testBeanRemote {

    
    public String businessMethod() {
        return "This is a test";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
