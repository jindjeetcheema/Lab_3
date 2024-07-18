/* 
* It is part of Lab 3.
* Submission Date: July 18, 2024
*
* @author Jindjeet Cheema
* @version 1.0
*/
package ca.ucalgary.ensf380;

public class Professor extends Person {
    private String teacherNumber;
    private double salary;

    public Professor(String name, String phoneNumber, String emailAddress, Address address, int lastPersonalNumber, 
                     String teacherNumber, double salary) {
        super(name, phoneNumber, emailAddress, address, lastPersonalNumber);
        this.teacherNumber = teacherNumber;
        this.salary = salary;
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
