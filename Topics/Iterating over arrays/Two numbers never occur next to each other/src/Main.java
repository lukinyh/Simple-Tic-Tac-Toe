import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean b = true;
        for (int i = 1; i < sizeOfArray - 1; i++) {
            if (arr[i] == n && (arr[i - 1] == m || arr[i + 1] == m)) {
                b = false;
            }
        }
        if (arr[0] == n && arr[1] == m ||
            arr[sizeOfArray - 1] == n && arr[sizeOfArray - 2] == m) {
            b = false;
        }
        System.out.println(b);
    }
}
