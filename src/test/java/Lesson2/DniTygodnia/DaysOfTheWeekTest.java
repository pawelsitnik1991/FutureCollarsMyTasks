package Lesson2.DniTygodnia;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DaysOfTheWeekTest {
    private DaysOfTheWeek daysOfTheWeek;

    public DaysOfTheWeekTest() {
        daysOfTheWeek = new DaysOfTheWeek();
    }

    @Test
    public void shouldReturnTrueIfDayIsMonday() {
        int day = 1;
        Assertions.assertEquals(daysOfTheWeek.dayOfTheWeekSwitch(day), "Monday");
    }

    @Test
    public void shouldReturnTrueIfDayIsTuesday() {
        int day = 2;
        Assertions.assertEquals(daysOfTheWeek.dayOfTheWeekSwitch(day), "Tuesday");
    }

    @Test
    public void shouldReturnTrueIfDayIsWednesday() {
        int day = 3;
        Assertions.assertEquals(daysOfTheWeek.dayOfTheWeekSwitch(day), "Wednesday");
    }

    @Test
    public void shouldReturnTrueIfDayIsThursday() {
        int day = 4;
        Assertions.assertEquals(daysOfTheWeek.dayOfTheWeekSwitch(day), "Thursday");
    }

    @Test
    public void shouldReturnTrueIfDayIsFriday() {
        int day = 5;
        Assertions.assertEquals(daysOfTheWeek.dayOfTheWeekSwitch(day), "Friday");
    }

    @Test
    public void shouldReturnTrueIfDayIsFirstDayOfWeekend() {
        int day = 6;
        Assertions.assertEquals(daysOfTheWeek.dayOfTheWeekSwitch(day), "Weekend");
    }

    @Test
    public void shouldReturnTrueIfDayIsSecondDayOfWeekend() {
        int day = 7;
        Assertions.assertEquals(daysOfTheWeek.dayOfTheWeekSwitch(day), "Weekend");
    }

    @Test
    public void shouldReturnTrueIfDayIsNotADayOfWeek() {
        int day = 8;
        Assertions.assertEquals(daysOfTheWeek.dayOfTheWeekSwitch(day), "There is no such a day!");
    }


}
