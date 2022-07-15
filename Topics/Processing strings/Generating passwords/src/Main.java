import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int uppercaseLetters = sc.nextInt();
        int lowercaseLetters = sc.nextInt();
        int digits = sc.nextInt();
        int quantity = sc.nextInt();

        final String[] approvedSymbols = {"A", "B", "a", "b", "1", "2"};
        StringBuffer str = new StringBuffer();

        boolean isDouble = true;
        if (uppercaseLetters + lowercaseLetters + digits == 0) {
            uppercaseLetters = quantity;
        }

        while (str.length() < quantity) {

            addSymbols(isDouble, str, uppercaseLetters, "AB");
            addSymbols(isDouble, str, lowercaseLetters, "ab");
            addSymbols(isDouble, str, digits, "12");
            isDouble = !isDouble;
        }
        System.out.println(str.substring(0, quantity));

    }

    private static void addSymbols(boolean isDouble, StringBuffer str, int number, String approvedSymbols) {
        char[] chars = approvedSymbols.toCharArray();
        for (int i = 0; i < number; i++) {
            if (isDouble) {
                str.append(chars[0]);
                isDouble = false;
            } else {
                str.append(chars[1]);
                isDouble = true;
            }
        }
    }
}
