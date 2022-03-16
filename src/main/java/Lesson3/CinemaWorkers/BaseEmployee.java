package Lesson3.CinemaWorkers;

public abstract class BaseEmployee {
    private String firstName;
    private String lastName;
    private final int basicSalary = 3000;
    private int yearOfEmployment;

    public BaseEmployee(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
        System.out.println("Pracujesz juz " + returnYearInWorking() + " lat");
    }

    public abstract int calculateMonthlySalary(int salary);

    public int getBasicSalary() {
        return basicSalary;
    }

    private int returnYearInWorking() {
        return 2022 - yearOfEmployment;
    }

}
