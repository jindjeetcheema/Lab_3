package ca.ucalgary.ensf380;

public class Anthology extends Book {
    private Story[] stories;

    public Story[] getStories() {
        return stories;
    }

    public void setStories(Story[] stories) {
        this.stories = stories;
    }

    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }
}
