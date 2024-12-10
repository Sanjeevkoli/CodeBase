// Expand Around Center
    // n^2    
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
        {
            return s;
        }

        String pal = s.substring(0, 1);

        for(int i = 0; i < s.length() - 1; i++)
        {
            String odd = expandAroundCenter(s, i, i);
            String even = expandAroundCenter(s, i, i + 1);

            // The expression string.substring(1, 1) in Java will return an empty string ("").
            if(pal.length() < odd.length())
            {
                pal = odd;
            }

            if(pal.length() < even.length())
            {
                pal = even;
            }
        }
            return pal;
    }

    public String expandAroundCenter(String s, int left, int right)
    {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
