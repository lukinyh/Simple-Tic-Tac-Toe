import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int number = sc.nextInt();
        if (number > str.length()) {
            System.out.println(str);
        } else {
            System.out.printf("%s%s", str.substring(number), str.substring(0, number));
        }
    }
}