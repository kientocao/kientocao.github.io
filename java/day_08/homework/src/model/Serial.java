package model;

public class Serial extends Film{
    private int totalEpisode;
    private String avgTime;
    public Serial(){};
    public Serial(int id, String title, String category, String author, String date, int totalEpisode, String avgTime){
        super(id, title, category, author, date);
        this.totalEpisode = totalEpisode;
        this.avgTime = avgTime;
    }

    public int getTotalEpisode() {
        return totalEpisode;
    }

    public void setTotalEpisode(int totalEpisode) {
        this.totalEpisode = totalEpisode;
    }

    public String getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(String avgTime) {
        this.avgTime = avgTime;
    }

    @Override
    public String toString() {
        return "Serial{" + "id=" + getId() +
                ", title='" + getTitle()+ '\'' +
                ", category='" + getCategory() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", date='" + getDate() + '\'' +
                "totalEpisode=" + totalEpisode +
                ", avgTime='" + avgTime + '\'' +
                "} " ;
    }
}
