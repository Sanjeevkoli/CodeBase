//Brute force - n^3 checkin palindrome - O(n/2) is treated as 𝑂(𝑛)O(n)
 public String longestPalindrome(String s)
{
    if (s.length() <= 1)
    {
        return s;
    }

    int maxLen = 1;
    String pal = s.substring(0, 1);

    for (int i = 0; i < s.length(); i++)
    {
        for (int j = i + maxLen; j <= s.length(); j++)
        {
            if (j - i > maxLen && isPalindrome(s.substring(i, j)))
            {
                maxLen = j - i;
                pal = s.substring(i, j);
            }
        }
    }
    return pal;
}

//O(n / 2) is treated as 𝑂(𝑛)
 public boolean isPalindrome(String str)
{
    int left = 0;
    int right = str.length() - 1;
    while (left < right)
    {
        if (str.charAt(left) != str.charAt(right))
        {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
