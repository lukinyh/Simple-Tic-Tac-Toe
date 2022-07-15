import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int[][] arr = new int[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                arr[i][j] = Math.abs(i - j);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
