package Lesson3.Cinema;

public class CinemaMain {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.isFree();
        Cinema.setStateIsFree(false);
        cinema.isFree();
    }
}
