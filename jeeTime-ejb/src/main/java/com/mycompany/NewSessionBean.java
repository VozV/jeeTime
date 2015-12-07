/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Calendar;
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
    
    public String getTime(){
        Calendar cal = Calendar.getInstance();
        
        return cal.toString();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
