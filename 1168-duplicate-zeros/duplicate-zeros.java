class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int count =0;
        for(int i=0;i<n &&count<n;i++){
            if(arr[i]==0){
                ans[count]=0;
                count++;
                if(count<n){
                    ans[count]=0;
                    count++;
                }
            }
            else{
            ans[count]= arr[i];
            count++;
            }

        }
            for(int i=0;i<n;i++){
                arr[i]=ans[i];
            }
    }
}