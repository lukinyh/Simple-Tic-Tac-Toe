import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int sum1 = summElem(str, 0, 2);
        int sum2 = summElem(str, 3, 5);
        if (sum1 == sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }

    private static int summElem(String str, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
}