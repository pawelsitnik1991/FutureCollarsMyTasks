package Lesson6.DivisibilityByThree;

public class DivisibilityByThree {

    public void validate(int[] values) {
        for (int value : values) {
            try {
                System.out.println(value);
                if (value % 3 != 0)
                    throw new IllegalArgumentException(" Not DivisibilityByThree " + value);
            } catch (IllegalArgumentException illegalArgumentException) {
                illegalArgumentException.printStackTrace();
            }
        }
    }
}
