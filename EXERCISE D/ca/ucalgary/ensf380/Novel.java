package ca.ucalgary.ensf380;

public class Novel extends Book {
    private Author[] theAuthors;
    private Series mySeries;

    public Author[] getTheAuthors() {
        return theAuthors;
    }

    public void setTheAuthors(Author[] theAuthors) {
        this.theAuthors = theAuthors;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series mySeries) {
        this.mySeries = mySeries;
    }

    public String theme() {
        return "Method theme called from Novel";
    }
}
