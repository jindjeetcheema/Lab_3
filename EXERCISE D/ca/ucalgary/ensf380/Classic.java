/* 
* It is part of Lab 3.
* Submission Date: July 18, 2024
*
* @author Jindjeet Cheema
* @version 1.0
*/
package ca.ucalgary.ensf380;

public class Classic extends Book {
    private int origPubYear = 1860;
    private Author theAuthor;
    private Publisher[] bookPublisher;

    public int getOrigPubYear() {
        return origPubYear;
    }

    public void setOrigPubYear(int origPubYear) {
        this.origPubYear = origPubYear;
    }

    public Author getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Publisher[] getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publisher[] bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String createNotes() {
        return "Method createNotes called from Classic";
    }
}
