import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        for (char symbols : str) {
            System.out.print(symbols);
            System.out.print(symbols);
        }
    }
}