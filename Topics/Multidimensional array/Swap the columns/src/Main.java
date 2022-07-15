import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int columnI = sc.nextInt();
        int columnJ = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int savedValue = arr[i][columnI];
            arr[i][columnI] = arr[i][columnJ];
            arr[i][columnJ] = savedValue;
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}