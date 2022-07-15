class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int length = twoDimArray.length;
        int rightCorner = twoDimArray[0].length - 1;
        int rightBottomCorner = twoDimArray[length - 1].length - 1;

        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][rightCorner]);
        System.out.println(twoDimArray[length - 1][0] + " " + twoDimArray[length - 1][rightBottomCorner]);
    }
}
