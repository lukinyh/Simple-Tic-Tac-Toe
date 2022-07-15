import java.util.Arrays;
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

        int places = sc.nextInt();
        int[] neededPlaces = new int[places];
        int result = 0;
        for (int i = 0; i < x; i++) {
            String str = Arrays.toString(neededPlaces);
            if (Arrays.toString(array[i]).contains(str.substring(1, str.length() - 1))) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result);
    }
}