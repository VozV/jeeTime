/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean {

    public void businessMethod() {
    }
    
    public Date getTime(){
        return new Date( System.currentTimeMillis());
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
