package sample;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String genre;
    private String producer;
    private int productionYear;
    private int releaseYear;
    private int duration; // This will be in minutes
    private String describtion;
    private ArrayList<Actor> actorsList; // The first two actors are the famous stars
    private String coverImagePath;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public void setActorsList(ArrayList<Actor> actorsList) {
        this.actorsList = actorsList;
    }

    public void setCoverImagePath(String coverImagePath) {
        this.coverImagePath = coverImagePath;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getProducer() {
        return producer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescribtion() {
        return describtion;
    }

    public ArrayList<Actor> getActorsList() {
        return actorsList;
    }

    public String getCoverImagePath() {
        return coverImagePath;
    }
}
