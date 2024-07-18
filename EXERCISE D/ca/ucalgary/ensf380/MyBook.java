/* 
* It is part of Lab 3.
* Submission Date: July 18, 2024
*
* @author Jindjeet Cheema
* @version 1.0
*/
package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {

        // Create author instances
        Author author1 = new Author("Author One", "123 Author St", 45);
        Author author2 = new Author("Author Two", "456 Author Ave", 38);

        // Create publisher instances
        Publisher publisher1 = new Publisher("Publisher One", "789 Publisher Rd");
        Publisher publisher2 = new Publisher("Publisher Two", "321 Publisher Blvd");

        // Create classic book instances
        Classic classicBook1 = new Classic();
        classicBook1.setTheAuthor(author1);
        classicBook1.setBookPublisher(new Publisher[]{publisher1});

        Classic classicBook2 = new Classic();
        classicBook2.setTheAuthor(author2);
        classicBook2.setBookPublisher(new Publisher[]{publisher2});

        // Create contract instances
        Contract contract1 = new Contract("2024-07-18", publisher1, new Author[]{author1});
        Contract contract2 = new Contract("2024-07-19", publisher2, new Author[]{author2});

        // Output some details to verify the scenario
        System.out.println("Publisher: " + publisher1.getName() + " published a classic book by " + classicBook1.getTheAuthor().getName());
        System.out.println("Publisher: " + publisher2.getName() + " published a classic book by " + classicBook2.getTheAuthor().getName());
        
        System.out.println(contract1.printContract());
        System.out.println(contract2.printContract());

        System.out.println(author1.write());
        System.out.println(author2.write());

        System.out.println(classicBook1.createNotes());
        System.out.println(classicBook2.createNotes());
    }
}
