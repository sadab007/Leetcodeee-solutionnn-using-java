class Solution {
    public int[] canSeePersonsCount(int[] h) {
        Stack<Integer>st = new Stack<>();
        int n = h.length;
        int ans[]= new int [n];
        ans[n-1]=0;
        st.push(h[n-1]);
        for(int i= n-2;i>=0;i--){
            int count =0;
            while(st.size()>0 && st.peek()<= h[i]){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;
            ans[i]= count;
            st.push(h[i]);
        }
        return ans;
    }
}