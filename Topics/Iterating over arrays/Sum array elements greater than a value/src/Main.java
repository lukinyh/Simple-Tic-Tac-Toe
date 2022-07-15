import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            mass[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i < size; i++) {
            if (mass[i] > num) {
                summ += mass[i];
            }
        }

        System.out.println(summ);
    }
}