import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // size
        int[] s = new int[size];
        for (int i = 0; i < size; i++) {
            s[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean b = false;
        for (int num = 1; num < size; num++) {
            if (s[num] == n && s[num - 1] == m || s[num] == m && s[num - 1] == n) {
                b = true;
            }
        }

        System.out.println(b);
    }
}