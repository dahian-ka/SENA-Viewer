package models;
public class Movie {
    private String id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private int year;
    private boolean viewed;
    private int timeViewed;

    // Constructor
    public Movie(String title, String genre, String creator, int duration, int year) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.viewed = false; // Por defecto, la película no ha sido visualizada
        this.timeViewed = 0;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getCreator() { return creator; }
    public void setCreator(String creator) { this.creator = creator; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public boolean isViewed() { return viewed; }
    public void setViewed(boolean viewed) { this.viewed = viewed; }

    public int getTimeViewed() { return timeViewed; }
    public void setTimeViewed(int timeViewed) { this.timeViewed = timeViewed; }
}

