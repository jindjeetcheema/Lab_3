/* 
* It is part of Lab 3.
* Submission Date: July 18, 2024
*
* @author Jindjeet Cheema
* @version 1.0
*/
package ca.ucalgary.ensf380;

public class Nonfiction extends Book {
    private Category deweyClassification;

    public Category getDeweyClassification() {
        return deweyClassification;
    }

    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }

    public String topic() {
        return "Method topic called from Nonfiction";
    }
}
