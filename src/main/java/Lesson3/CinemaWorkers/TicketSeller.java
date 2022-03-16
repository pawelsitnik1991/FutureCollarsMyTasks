package Lesson3.CinemaWorkers;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(int yearOfEmployment) {
        super(yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary(int salary) {
        int remuneration;
        if (salary < getBasicSalary()) {
            remuneration = getBasicSalary();
        } else
            remuneration = salary;
        return remuneration;
    }
}
