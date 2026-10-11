class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Arrays.sort(candyType);
        int count  =1;
        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1]){
                count++;
            }
            }
           int half = n/2;
           if(count<half){
            return count;
           }
           else{
            return half;
           }
        }
    }
