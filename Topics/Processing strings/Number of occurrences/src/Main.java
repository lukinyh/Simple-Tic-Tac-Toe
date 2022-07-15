import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String substring = sc.nextLine();

        String newStr = str.replaceAll(substring, "");
        System.out.println((str.length() - newStr.length()) / substring.length());
    }
}