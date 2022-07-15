class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here
        final int third = 3;

        for (int i = 0; i < twoDimArray[third - 1].length; i++) {
            System.out.print(twoDimArray[third - 1][i] + " ");
        }
        System.out.println();

    }
}