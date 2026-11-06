// class Solution {
//     public boolean isValid(String s) {
//         Stack<String> ss = new Stack<>();
//         int n = s.length();
//         boolean ans = false;
//         for(int i=0;i<n;i++){
//             if(s.equals('(','[','{')){
//                 ss.push(s);
//                 ans = true;
//             }
//             else if(ss.peek()== s.equals(')',']','}')){
//                 ss.pop();
//                 ans = true;
//             }
           
//         }
//         return ans;
//     }
// }

class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                ss.push(ch);
            }
            else {
                if (ss.isEmpty()) {
                    return false;
                }
                if (ch == ')' && ss.peek() == '(') {
                    ss.pop();
                }
                else if (ch == ']' && ss.peek() == '[') {
                    ss.pop();
                }
                else if (ch == '}' && ss.peek() == '{') {
                    ss.pop();
                }
                else {
                    return false;
                }
            }
        }
        return (ss.size()==0);
    }
}