 public int beautySum(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++)
        {
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = i; j < s.length(); j++)
            {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;

                for(int value : map.values())
                {
                    maxi = Math.max(maxi, value);
                    mini = Math.min(mini, value);
                }
                ans += maxi - mini;
            }
        }

        return ans;
    }
