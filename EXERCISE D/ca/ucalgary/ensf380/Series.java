package ca.ucalgary.ensf380;

public class Series {
    private String seriesName;

    public Series(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String theme() {
        return "Method theme called from Series";
    }
}
