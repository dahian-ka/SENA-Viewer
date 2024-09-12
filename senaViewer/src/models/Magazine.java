package models;

public class Magazine extends Publication {

    public Magazine(String title, String edititionDate, String editorial) {
        super(title, edititionDate, editorial);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + getTitle() + '\'' +
                ", edititionDate='" + getEdititionDate() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                ", authors=" + getAuthors() +
                '}';
    }
}


