class Solution {
    public int removeDuplicates(int[] nums) {
       ArrayList<Integer>Hm = new ArrayList<>();
       for(int ele : nums){
        if(!Hm.contains(ele))
        Hm.add(ele);
       }
       for(int i=0;i<Hm.size();i++){
        nums[i]=Hm.get(i);
       }
       
       return Hm.size();
    }
}