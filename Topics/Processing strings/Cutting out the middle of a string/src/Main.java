import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.nextLine());
        int index = str.length() / 2;

        if (str.length() % 2 == 0) {
            System.out.println(str.delete(index - 1, index + 1));
        } else {
            System.out.println(str.deleteCharAt(index));
        }
    }
}
