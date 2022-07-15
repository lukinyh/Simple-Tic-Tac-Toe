import java.util.*;

public class Main {
    final static int SIZE = 3;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] box1 = determinateBox(sc).clone();
        int[] box2 = determinateBox(sc).clone();

        int first = 0;
        int second = 0;
        for (int i = 0; i < SIZE; i++) {
            if (box1[i] > box2[i]) {
                second++;
            } else if (box1[i] < box2[i]) {
                first++;
            }
        }

        if (first == SIZE) {
            System.out.println("Box 1 < Box 2");
        } else if (second == SIZE) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }

    private static int[] determinateBox(Scanner sc) {
        int[] box = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            box[i] = sc.nextInt();
        }
        Arrays.sort(box);
        return box;
    }
}
