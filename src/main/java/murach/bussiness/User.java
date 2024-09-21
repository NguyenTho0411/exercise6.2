/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.bussiness;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String heardForm;
    private String updates;
    private String contactVia;

    public User() {
        firstName ="";
        lastName ="";
        email ="";
        heardForm ="";
        updates ="";
        contactVia="";
    }
    public User(String firstName, String lstName, String email, String heardForm, String updates, String contactVia) {
        this.firstName = firstName;
        this.lastName = lstName;
        this.email = email;
        this.heardForm = heardForm;
        this.updates = updates;
        this.contactVia = contactVia;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lstName) {
        this.lastName = lstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeardForm() {
        return heardForm;
    }

    public void setHeardForm(String heardForm) {
        this.heardForm = heardForm;
    }

    public String getUpdates() {
        return updates;
    }

    public void setUpdates(String updates) {
        this.updates = updates;
    }

    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }
    
    
    
}
