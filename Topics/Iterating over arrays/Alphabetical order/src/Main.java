import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean isAlphabetical = true;
        String firstEl = scanner.next();
        String secondEl;
        while (scanner.hasNext()) {
            secondEl = scanner.next();
            if (firstEl.compareTo(secondEl) > 0) {
                isAlphabetical = false;
            }
            firstEl = secondEl;
        }
        System.out.println(isAlphabetical);
    }
}