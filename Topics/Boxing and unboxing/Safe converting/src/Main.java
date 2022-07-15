import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        // write your code here
        /*return val == null ? 0
                : val > Integer.MAX_VALUE ? Integer.MAX_VALUE
                : val < Integer.MIN_VALUE ? Integer.MIN_VALUE
                : val.intValue();*/
        int i;
        if (val == null) {
            i = 0;
        } else if (val <= Integer.MIN_VALUE) {
            i = Integer.MIN_VALUE;
        } else if (val >= Integer.MAX_VALUE) {
            i = Integer.MAX_VALUE;
        } else {
            i = val.intValue();
        }
        return i;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}