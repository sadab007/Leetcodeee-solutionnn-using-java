class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(threshold<height[i-1]){
                list.add(i);
            }
        }
        return list;
    }
}