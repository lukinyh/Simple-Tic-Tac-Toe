import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int[] newArr = new int[arr.length];
        newArr = arr.clone();
        int stepsNew = steps % arr.length;

        for (int i = 0; i < arr.length; i++) {
            int index = i - stepsNew;
            if (index >= 0) {
                arr[i] = newArr[index];
            } else {
                arr[i] = newArr[arr.length + index];
            }
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
