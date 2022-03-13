package Lesson3.Cinema;

public class Cinema {

    private int numberOfSeat;
    private int rowNumber;
    private static boolean stateIsFree = true;

    public boolean isFree() {
        if (stateIsFree) {
            System.out.println("Miejsce jest wolne");
        } else {
            System.out.println("Miejsce jest zajęte");
        }
        return stateIsFree = false;
    }

    public static void setStateIsFree(boolean changeCondition) {
        Cinema.stateIsFree = changeCondition;
    }
}




