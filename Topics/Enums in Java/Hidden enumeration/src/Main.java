public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        for (Secret sc : Secret.values()) {
            if (sc.toString().toUpperCase().startsWith("STAR")) {
                counter++;
            }
        }
        //Secret.valueOf("STAR").toString().toUpperCase().startsWith("STAR");

        System.out.println(counter);
    }
}

/* sample enum for inspiration*/
/*enum Secret {
    STAR, CRASH, START, START1, ONE, TWO, START3, ANOTHERSTART
}*/