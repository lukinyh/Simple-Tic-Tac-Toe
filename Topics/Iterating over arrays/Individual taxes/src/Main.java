import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] yearlyIncomes = new int[size];
        yearlyIncomes = fillArray(scanner, size);
        scanner.nextLine();
        int[] individualTaxes = new int[size];
        individualTaxes = fillArray(scanner, size);

        int maxValue = 0;
        int companyNumber = 0;
        for (int i = 0; i < size; i++) {
            int value = individualTaxes[i] * yearlyIncomes[i];
            if (value > maxValue) {
                maxValue = value;
                companyNumber = i;
            }
        }

        System.out.println(companyNumber + 1);
    }

    private static int[] fillArray(Scanner sc, int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }
}