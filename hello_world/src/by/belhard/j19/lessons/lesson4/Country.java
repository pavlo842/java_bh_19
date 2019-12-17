package by.belhard.j19.lessons.lesson4;

public class Country {

    String title;
    int zipCode = 12345;

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
