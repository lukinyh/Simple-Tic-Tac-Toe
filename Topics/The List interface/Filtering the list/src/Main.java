import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");

        final List<Integer> list = Arrays.asList(values).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        removeOddElements(list);
        printReverseList(list);
    }

    private static void removeOddElements(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }
    }

    private static void printReverseList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
    /*
    integers.removeIf(e -> integers.indexOf(e) % 2 == 0);
        Collections.reverse(integers);
        integers.forEach(e -> System.out.print(e + " "));
     */
}