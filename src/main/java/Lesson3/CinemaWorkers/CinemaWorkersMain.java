package Lesson3.CinemaWorkers;

public class CinemaWorkersMain {
    public static void main(String[] args) {
        Manager manager = new Manager(1991);
        System.out.println(manager.getBasicSalary());
        System.out.println(manager.calculateMonthlySalary(4000));

        TicketSeller ticketSeller = new TicketSeller(2000);
        System.out.println(ticketSeller.getBasicSalary());
        System.out.println(ticketSeller.calculateMonthlySalary(5000));
    }
}
