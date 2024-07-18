/* 
* It is part of Lab 3.
* Submission Date: July 18, 2024
*
* @author Jindjeet Cheema
* @version 1.0
*/
package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "Calgary", "AB", "T2N 1N4", "Canada");
        Address address2 = new Address("456 Secondary St", "Calgary", "AB", "T2N 2N5", "Canada");

        Professor prof1 = new Professor("John Doe", "403-123-4567", "johndoe@university.ca", address1, 1001, "T123", 90000.00);
        Student student1 = new Student("Jane Smith", "403-234-5678", "janesmith@university.ca", address2, 1002, "S123", prof1, 3.2);
        Student student2 = new Student("Alex Brown", "403-345-6789", "alexbrown@university.ca", address2, 1003, "S124", prof1, 3.8);

        System.out.println(prof1.getName() + " supervises " + student1.getName() + " and " + student2.getName());
        System.out.println(student1.getName() + " lives at: " + student1.getAddress().outputAsLabel());
        System.out.println(student2.getName() + " lives at: " + student2.getAddress().outputAsLabel());
    }
}
