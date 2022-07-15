import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        final String the = "the";
        int place = -1;
        if (str.contains(the)) {
            String[] newStr = str.split(the);
            if (newStr.length == 0) {
                place = 0;
            } else {
                place = newStr[0].length();
            }
        }
        System.out.println(place);
    }
}
