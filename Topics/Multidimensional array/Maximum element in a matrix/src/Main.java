import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int max = array[0][0];
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    maxX = i;
                    maxY = j;
                }
            }
        }

        System.out.println(maxX + " " + maxY);
    }
}
