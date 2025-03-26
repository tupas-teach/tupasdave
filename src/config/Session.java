/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Dell
 */
public class Session {
    
     private static Session instance;
    private int id;
    private String fn;
    private String ln;
    private String un;
    private String type;
    private String status;
    private String email;
    private Session(){
    
}


    public static synchronized Session getInstance(){
       if(instance == null){
           instance = new Session();
       }
       return instance;
    }
    public static boolean isInstanceEmpty(){
        return instance ==null;
    }

    public int getId(){
        return id ;
    }

    public void setId(int id) {
         this.id = id;
   
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
     
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
