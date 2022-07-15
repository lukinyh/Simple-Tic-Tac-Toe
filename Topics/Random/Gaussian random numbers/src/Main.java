import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        boolean isOk = false;
        while (!isOk) {
            Random random = new Random(k);
            for (int i = 0; i < n; i++) {
                double randomGaus = random.nextGaussian();
                if (randomGaus > m) {
                    k++;
                    break;
                } else {
                    if (i == (n - 1)) {
                        isOk = true;
                    }
                }
            }
        }
        System.out.println(k);

    }
}
