import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int maxMul = arr[0];
        for (int i = 0; i < size - 1; i++) {
            int mul = arr[i] * arr[i + 1];
            if (mul > maxMul) {
                maxMul = mul;
            }
        }
        System.out.println(maxMul);
    }
}