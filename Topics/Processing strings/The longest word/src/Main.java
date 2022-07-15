import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int iMax = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[iMax].length() < str[i].length()) {
                iMax = i;
            }
        }
        System.out.println(str[iMax]);
    }
}
