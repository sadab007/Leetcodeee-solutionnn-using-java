import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int temp[] = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }
        for(int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}



// class Solution {
//     public int[] arrayRankTransform(int[] arr) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int n = arr.length;
//         int ans[]= new int [n];
//         for(int i =0;i<n;i++){
//             list.add(arr[i]);
//         }
//         Arrays.sort(arr);
//         int count =1;
//         ans[0]=1;
//         for(int i =1;i<n;i++){
//             if(arr[i]==arr[i-1]){
//                 ans[i]=count;
//             }
//             else{
//                 count++;
//                 ans[i]=count;
//             }
//         }
//         return ans;
//     }
// }