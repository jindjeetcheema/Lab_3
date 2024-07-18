/* 
* It is part of Lab 3.
* Submission Date: July 18, 2024
*
* @author Jindjeet Cheema
* @version 1.0
*/
package ca.ucalgary.ensf380;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private int lastPersonalNumber;
    
    public Person(String name, String phoneNumber, String emailAddress, Address address, int lastPersonalNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.lastPersonalNumber = lastPersonalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getLastPersonalNumber() {
        return lastPersonalNumber;
    }

    public void setLastPersonalNumber(int lastPersonalNumber) {
        this.lastPersonalNumber = lastPersonalNumber;
    }
    
    public String nextPersonalNumber(short type) {
        // Implementation of the method based on type
        return String.valueOf(type) + lastPersonalNumber;
    }
    
    public boolean hasValidAddress() {
        return address.validate();
    }
}
