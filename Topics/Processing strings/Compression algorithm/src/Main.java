import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 1;
        int length = str.length();
        if (length > 1) {
            for (int i = 1; i < length; i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    System.out.print(str.charAt(i - 1));
                    System.out.print(count);
                    count = 1;
                }
            }
            System.out.print(str.charAt(length - 1));
            System.out.print(count);
        } else {
            System.out.print(str + 1);
        }
    }

    /*
     var in = scanner.next().split("(?<=(.))(?!\\1)");
        for (String s : in) {
            System.out.printf("%c%d", s.charAt(0), s.length());
        }

     */
}