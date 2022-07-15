import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            int length = list.get(i).length();
            if (maxLength < length) {
                maxLength = length;
                index = i;
            }
        }
        String maxStr = list.get(index);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, maxStr);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
