import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("-");
        System.out.printf("%s/%s/%s", str[1], str[2], str[0]);
    }
}