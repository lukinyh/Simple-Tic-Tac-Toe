import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String alphabeth = "abcdefghijklmnopkrstuvwxyz";

        System.out.println(alphabeth.contains(str));

    }
}