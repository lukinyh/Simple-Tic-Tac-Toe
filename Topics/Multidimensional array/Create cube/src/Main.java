
class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        final int dimensional = 3;
        int[][][] cube = new int[dimensional][dimensional][dimensional];
        int indexA = 0;
        int indexC = 0;
        for (int a = 0; a < dimensional; a++) {
            for (int b = 0; b < dimensional; b++) {
                indexC = 0;
                for (int c = 0; c < dimensional; c++) {
                    cube[b][a][c] = a + indexC + indexA;
                    indexC += 1;
                }
            }
            indexA += 2;
        }
        return cube;
    }
}
