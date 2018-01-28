/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcityb_groupi;

/**
 *
 * @author alexj
 */
public class User {
    
    private String username;
    private String passwordHash;
    private String passwordSalt;
    private String fingerPrint;
    private String type;
    
    public String getUsername(){
        return username;
    }
    
    public String getType(){
        return type;
    }
    
    public String getFingerPrint(){
        return fingerPrint;
    }
    
    public Boolean decrypt(){
        
    }
}
