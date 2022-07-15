import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] arr = fillArray(scanner, size);

        putItOnNext(arr[0], 0, arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] fillArray(Scanner sc, int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    private static void putItOnNext(int elem, int index, int[] array) {
        if (index + 1 == array.length) {
            array[0] = elem;
        } else {
            int next_elem = array[index + 1];
            array[index + 1] = elem;
            putItOnNext(next_elem, index + 1, array);
        }

    }
}