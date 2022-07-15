import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str;
        while (!"0".equals(str = sc.nextLine())) {
            multipleToTen(str);
        }
    }

    private static void multipleToTen(String str) {
        try {
            System.out.println(Integer.valueOf(str) * 10);
        } catch (NumberFormatException e) {
            System.out.println("Invalid user input: " + str);
        }
    }
}