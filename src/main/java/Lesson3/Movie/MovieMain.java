package Lesson3.Movie;

public class MovieMain {

    public static void main(String[] args) {
        Movie movie = new Movie("LOTR","JR",120,2010);
        System.out.println(movie.getTitle());
        System.out.println(movie.getNameAndSurnameOfTheDirector());
        System.out.println(movie.getDuration());
        System.out.println(movie.getYearOfProduction());
    }
}
