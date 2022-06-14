package lab;

import java.text.NumberFormat;

public record Film(String name, int length, int votes, String genre, int year, String country) {

    private static final String director = "Quentin Tarantino";

    public Film(String name, int length, int votes, String genre, int year, String country) {
        this.name = name;
        this.length = length;
        this.votes = votes;
        this.genre = genre;
        this.year = year;
        this.country = country;
    }

    public Film(String name, int length, int votes) {
        this(name, length, votes, "Drama", 1994, "USA");
    }

    public Film(){
        this("Pulp Fiction", 154, 1988284);
    }

    public static String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return name + "( " + year + ", " + country + ") | " + genre + " | " + length + " min | "
                + NumberFormat.getInstance().format(votes) + " votes";
    }
}
