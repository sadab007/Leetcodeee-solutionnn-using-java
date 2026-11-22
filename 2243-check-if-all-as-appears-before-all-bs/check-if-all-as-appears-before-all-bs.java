class Solution {
    public boolean checkString(String s) {
        int temp =-1;
        for(int i =0;i<s.length();i++){
            char x = s.charAt(i);
            if(x =='a'){
                temp = i;
            }
        }
            if(temp ==-1){
                return true;
            }
        else{

        for(int i=0;i<=temp;i++){
            if(s.charAt(i)=='b'){
                return false;
            }
        }
        }
        return true;
    }
}