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
