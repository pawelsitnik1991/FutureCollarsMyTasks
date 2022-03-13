package Lesson2.DniTygodnia;

public class DaysOfTheWeek {

    public String dayOfTheWeekSwitch(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6, 7:
                return "Weekend";
            default:
                return "There is no such a day!";
        }

    }
}
