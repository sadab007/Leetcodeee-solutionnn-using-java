import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int x : arr1) {
            list.add(x);
        }

        int[] ans = new int[arr1.length];
        int index = 0;

        for (int x : arr2) {

            for (int i = 0; i < list.size(); i++) {

                if (list.get(i) == x) {
                    ans[index] = x;
                    index++;
                }
            }

            list.removeIf(num -> num == x);
        }

        Collections.sort(list);

        for (int x : list) {
            ans[index] = x;
            index++;
        }

        return ans;
    }
}
