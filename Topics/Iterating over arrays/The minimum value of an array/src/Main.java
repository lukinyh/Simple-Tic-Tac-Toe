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
        int min = array[0];
        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }

        System.out.println(min);
    }
}
