package Lesson5.GameFizzBuzz;

public class FizzBuzz {

    private int numbers;

    public FizzBuzz(int numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        int[] tablica = new int[numbers];
        for (int i = 1; i < tablica.length; i++) {
            tablica[i] = i;
        }
        return tablica;
    }

    public void isFizz() {
        for (int number : getNumbers()) {
            if (number % 3 == 0) {
                System.out.println("Fizz " + number);
            }
        }
    }

    public void isBuzz() {
        for (int number : getNumbers()) {
            if (number % 5 == 0) {
                System.out.println("Buzz " + number);
            }
        }
    }

    public void isFizzAndBuzz() {
        for (int number : getNumbers()) {
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("FizzBuzz " + number);
            }
        }
    }

}