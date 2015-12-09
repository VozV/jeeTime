package com.mycompany;

import java.util.Date;
import javax.ejb.Stateless;
//import javax.ejb.LocalBean;

@Stateless
//@LocalBean
public class NewSessionBean {
  
    public Date getTime(){
        return new Date( System.currentTimeMillis());
    }
}
