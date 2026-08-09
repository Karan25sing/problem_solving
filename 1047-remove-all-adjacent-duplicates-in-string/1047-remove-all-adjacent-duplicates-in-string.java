class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            res.append(st.peek());
            st.pop();
        }
        res.reverse();
        return res.toString();
    }
}