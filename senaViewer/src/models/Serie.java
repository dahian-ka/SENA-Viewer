package models;

public class Serie extends Film {
    private int sessionQuantity;
    private int timeViewed;

    public Serie(String title, String genre, String creator, int duration, int year, int sessionQuantity) {
        super(title, genre, creator, duration, year);
        this.sessionQuantity = sessionQuantity;
        this.timeViewed = 0;
    }

    // Getters y Setters
    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + getTitle() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", creator='" + getCreator() + '\'' +
                ", duration=" + getDuration() +
                ", year=" + getYear() +
                ", sessionQuantity=" + sessionQuantity +
                ", timeViewed=" + timeViewed +
                '}';
    }
}


