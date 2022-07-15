import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) {
        // write your code here
        String[] arr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        if (number < 1 || number > arr.length) {
            throw new IllegalArgumentException();
        } else {
            return arr[number - 1];
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
