package com.java.design.pattern.structural;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet 
{ 
    private Internet internet = new ActInternet(); 
    private static List<String> bannedSites; 
      
    static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("abc.com"); 
        bannedSites.add("def.com"); 
        bannedSites.add("ijk.com"); 
        bannedSites.add("lnm.com"); 
    } 
      
    @Override
    public void connectTo(String serverhost) throws Exception 
    { 
        System.out.println("Connecting to "+ serverhost); 

        if(bannedSites.contains(serverhost.toLowerCase())) 
        { 
            throw new Exception("Access Denied for "+serverhost); 
        } 
          
        internet.connectTo(serverhost); 
    } 
  
} 

