class Solution {

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String word = "";

        for(int i = s.length() - 1; i >= 0; i--)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                if(word.length() != 0)
                {
                    ans.append(word);
                    ans.append(" ");
                    word = "";
                }
            }
            else
            {
                word = ch + word;
            }
        }
        // if there is no space at last in given string, this case executes
        if(word.length() != 0)
        {
            ans.append(word);
        }
        return ans.toString().trim();
    }
}
