import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double p = (a + b + c) / 2;

        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
