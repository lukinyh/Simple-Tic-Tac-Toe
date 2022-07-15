import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine(); // size
        String s = sc.nextLine();
        String part = sc.nextLine().strip();
        boolean b = false;
        if (s.contains(part)) {
            b = true;
        }
        System.out.println(b);
    }
}
