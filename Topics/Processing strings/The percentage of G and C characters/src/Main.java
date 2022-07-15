import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toLowerCase().toCharArray();
        int length = str.length;
        char g = 'g';
        char c = 'c';
        int count = 0;
        for (char element : str) {
            if (element == g || element == c) {
                count++;
            }
        }
        System.out.println(((double) count / length) * 100);
    }
}