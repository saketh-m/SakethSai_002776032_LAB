/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author saketh
 */
public class Person {
    String firstName;
    String lastname;
    Address permanentAddress;
    String nuid;
    String collegename;
    Contact officeContact;
    Contact personalContact;
    Address currentAddress;
    
    
    
    
    public Person(){
        this.firstName = "";
        this.lastname = "";
        this.permanentAddress= new Address();
        this.currentAddress = new Address();
        this.personalContact= new Contact();
        this.officeContact = new Contact();
        this.collegename = "";
        this.nuid = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }

    
    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        this.nuid = nuid;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }
    
    
    
 
     public static void main (String args[]){
            Person obj = new Person();
            
            obj.setFirstName("Saketh");
            obj.setLastname("Mallepaddi");
            obj.setNuid("002776032");
            obj.setCollegename("Northeastern");
            Contact personalcontact =obj.getPersonalContact();
            Contact officecontact = obj.getOfficeContact();
            Address permanentaddr = obj.getPermanentAddress();
            Address currentaddr = obj.getCurrentAddress();
            
            permanentaddr.setStreetName("Cummings Road");
            permanentaddr.setAptNo("45");
            permanentaddr.setCity("Boston");
            permanentaddr.setZipCode("02135");
            
            currentaddr.setStreetName("Huntington");
            currentaddr.setAptNo("44");
            currentaddr.setCity("Boston");
            currentaddr.setZipCode("02188");
            
            personalcontact.setEmail("saketh@gmail.com");
            officecontact.setEmail("sakethp@gmail.com");
            personalcontact.setPhone("8571234567");
            officecontact.setPhone("123456789");
            
    }
}
