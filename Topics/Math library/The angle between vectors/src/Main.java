import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        double v1i = sc.nextDouble();
        double v1j = sc.nextDouble();

        double v2i = sc.nextDouble();
        double v2j = sc.nextDouble();

        double mulVs = v1i * v2i + v1j * v2j;
        double lengthV1 = Math.sqrt(Math.pow(v1i, 2) + Math.pow(v1j, 2));
        double lengthV2 = Math.sqrt(Math.pow(v2i, 2) + Math.pow(v2j, 2));

        double cosAlfa = mulVs / (lengthV2 * lengthV1);

        System.out.println(Math.toDegrees(Math.acos(cosAlfa)));
    }
}