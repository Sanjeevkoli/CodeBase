class Solution {
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        while(i >= 0)
        {
            if((int)num.charAt(i) % 2 == 1)
            {
                return num.substring(0, i + 1);
            }
            i--;
        }
        return "";
    }
}
