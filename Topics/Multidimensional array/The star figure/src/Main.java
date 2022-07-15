import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[][] star = new char[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                star[i][j] = '.';
                if (i == j) {
                    star[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < num; i++) {
            star[i][num / 2] = '*';
            star[num / 2][i] = '*';
            star[i][num - 1 - i] = '*';
        }
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.printf("%c ", star[i][j]);
            }
            System.out.println();
        }
    }
}
