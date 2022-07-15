import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().split("\\?")[1];
        String[] parameters = str.split("&");

        String notFound = "not found";
        String valueOfPass = null;
        for (String param: parameters) {
            String[] result = param.split("=");

            if (result.length != 2) {
                System.out.printf("%s : %s\n", result[0], notFound);
            } else {
                System.out.printf("%s : %s\n", result[0], result[1]);
            }
            if (result[0].equals("pass")) {
                valueOfPass = result[1];
            }
        }
        if (str.contains("pass")) {
            System.out.printf("password : %s\n", valueOfPass);
        }
    }
}