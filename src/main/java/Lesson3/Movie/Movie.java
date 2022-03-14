package Lesson3.Movie;

public class Movie {

    private String title;
    private String nameAndSurnameOfTheDirector;
    private int duration;
    private int yearOfProduction;

    public Movie(String title, String nameAndSurnameOfTheDirector, int duration, int yearOfProduction) {
        this.title = title;
        this.nameAndSurnameOfTheDirector = nameAndSurnameOfTheDirector;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public String getNameAndSurnameOfTheDirector() {
        return nameAndSurnameOfTheDirector;
    }

    public int getDuration() {
        return duration;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
