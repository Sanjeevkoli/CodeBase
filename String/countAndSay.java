class Solution {
    public String countAndSay(int n) {
        if(n == 1)
        {
            return "1";
        }
        String say = countAndSay(n - 1);
        //String result = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < say.length(); i++)
        {
            int count = 1; // compairing two char so for current char it should be 1
            char ch = say.charAt(i);
            while(i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1))// we are using i, so it is moving forward
            {
                count++;
                i++;
            }
            //result += count + "" + ch;
            sb.append(count).append(ch);
        }
        //return result;
        return sb.toString();
    }
}
