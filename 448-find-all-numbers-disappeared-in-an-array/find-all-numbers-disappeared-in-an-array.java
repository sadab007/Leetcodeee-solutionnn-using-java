class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>list = new HashSet<>();
        ArrayList<Integer>ans = new ArrayList<>();
      
        for(int ele : nums){
            list.add(ele);
        }
        for(int i=1;i<=nums.length;i++){
            if(list.contains(i)){
                continue;
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}