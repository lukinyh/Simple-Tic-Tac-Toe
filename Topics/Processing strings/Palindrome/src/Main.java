import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        char[] str = sc.nextLine().toCharArray();
        char[] strReverse = new char[str.length];
        int j = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            strReverse[j] = str[i];
            j++;
        }

        if (String.valueOf(str).equals(String.valueOf(strReverse))) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
