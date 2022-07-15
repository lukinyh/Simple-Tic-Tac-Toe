import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int maxI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                maxI = i;
                max = arr[i];
            }
        }
        System.out.println(maxI);
    }
}
