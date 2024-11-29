class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i < s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     if(ch == '(')
        //     {
        //         if(!st.isEmpty())
        //         {
        //             sb.append(ch);
        //         }
        //         st.push(ch);
        //     }
        //     else
        //     {
        //         st.pop();
        //         if(!st.isEmpty())
        //         {
        //             sb.append(ch);
        //         }
        //     }
        // }
        // return sb.toString();

        // Without Stack
        StringBuilder sb = new StringBuilder();
        int opened = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if(opened > 0)
                {
                    sb.append(ch);
                }
                opened++;
            }
            else
            {
                if(opened > 1)
                {
                    sb.append(ch);
                }
                opened--;
            }
        }
        return sb.toString();
    }
}
