import java.util.*;

class PairWithGivenSum {
    static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8};
        int target = 10;
        System.out.println(hasPairWithSum(arr, target));
    }
}
