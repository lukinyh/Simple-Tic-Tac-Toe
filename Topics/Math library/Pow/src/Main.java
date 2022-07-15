import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        try {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println(Math.pow(a, b));
        } catch (Exception e) {
            System.out.println("Invalid parameter");
        }
    }
}