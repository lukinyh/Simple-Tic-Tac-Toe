import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int seedFromA = scanner.nextInt();
        int seedFromB = scanner.nextInt();
        int numberN = scanner.nextInt();
        int borderK = scanner.nextInt();

        int minOfMax = Integer.MAX_VALUE;
        int index = 0;
        int[] max = new int[seedFromB - seedFromA + 1];

        int seedOfMin = seedFromA;
        for (int seed = seedFromA; seed <= seedFromB; seed++) {
            Random random = new Random(seed);
            int[] arr = new int[numberN];
            for (int i = 0; i < numberN; i++) {
                arr[i] = random.nextInt(borderK);
            }
            Arrays.sort(arr);
            max[seed - seedFromA] = arr[arr.length - 1];
        }
        for (int i = 0; i < max.length; i++) {
            if (minOfMax > max[i]) {
                minOfMax = max[i];
                index = i;
            }
        }

        System.out.println(seedFromA + index);
        System.out.println(minOfMax);
    }
}