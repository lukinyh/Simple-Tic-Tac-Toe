import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        str = List.of(scanner.nextLine().split(""));
        String volwels = "aeiouy";
       
        int countA = 0;
        int countB = 0;
        if (str.size() >= 3) {
            for (int i = 2; i < str.size(); i++) {
                if (volwels.contains(str.get(i - 2)) && volwels.contains(str.get(i - 1)) && volwels.contains(str.get(i))) {
                    countA++;
                    i++;
                }
                if (!volwels.contains(str.get(i - 2)) && !volwels.contains(str.get(i - 1)) && !volwels.contains(str.get(i))) {
                    countB++;
                    i++;
                }
            }
        }
        System.out.println(countA + countB);
    }
}
