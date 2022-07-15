import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        return returnsNumberOfCount(elem, list1) == returnsNumberOfCount(elem, list2);
    }

    private static int returnsNumberOfCount(int elem, List<Integer> list) {
        int count = 0;
        for (int val : list) {
            if (elem == val) {
                count += 1;
            }
        }
        return count;
    }
}
