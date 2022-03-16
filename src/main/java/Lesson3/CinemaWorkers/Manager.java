package Lesson3.CinemaWorkers;

public class Manager extends BaseEmployee {

    private final int basicSalary = 5000;
    private final int extraMoney = 500;

    public Manager(int yearOfEmployment) {
        super(yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary(int salary) {
        int remuneration;
        if (salary < 5000) {
            remuneration = basicSalary + extraMoney;
        } else
            remuneration = salary + extraMoney;
        return remuneration;
    }
}
