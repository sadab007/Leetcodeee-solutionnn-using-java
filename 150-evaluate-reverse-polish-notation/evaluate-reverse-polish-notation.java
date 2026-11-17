class Solution {
    public int evalRPN(String[] t) {
        Stack <Integer> st = new Stack<>();
        for(int i =0;i<t.length;i++){
            if(t[i].equals("+")){
            int a = st.pop();
            int b = st.pop();
            st.push(b+a);
            }
            else if(t[i].equals("-")){
            int a = st.pop();
            int b = st.pop();
            st.push(b-a);
            }
            else if(t[i].equals("/")){
            int a = st.pop();
            int b = st.pop();
            st.push(b/a);
            }
            else if(t[i].equals("*")){
            int a = st.pop();
            int b = st.pop();
            st.push(b*a);
            }
            else{
                st.push(Integer.parseInt(t[i]));
            }
        }
        return st.peek();
    }
}

// class Solution {
//     public int evalRPN(String[] t) {

//         Stack<Integer> st = new Stack<>();

//         for (int i = 0; i < t.length; i++) {

//             if (t[i].equals("+")) {
//                 int a = st.pop();
//                 int b = st.pop();

//                 st.push(b + a);
//             }

//             else if (t[i].equals("-")) {
//                 int a = st.pop();
//                 int b = st.pop();

//                 st.push(b - a);
//             }

//             else if (t[i].equals("*")) {
//                 int a = st.pop();
//                 int b = st.pop();

//                 st.push(b * a);
//             }

//             else if (t[i].equals("/")) {
//                 int a = st.pop();
//                 int b = st.pop();

//                 st.push(b / a);
//             }

//             else {
//                 st.push(Integer.parseInt(t[i]));
//             }
//         }

//         return st.peek();
//     }
// }