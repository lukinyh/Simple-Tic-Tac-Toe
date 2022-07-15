import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int num = 0;

        for (int i = 2; i < size; i++) {
            if (array[i] - 1 == array[i - 1] && array[i - 1] - 1 == array[i - 2]) {
                num++;
            }
        }

        System.out.println(num);
    }
}