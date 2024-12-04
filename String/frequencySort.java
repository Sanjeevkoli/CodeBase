class Solution {
    //nlogn
    // public String frequencySort(String s) {
    //     int[] freq = new int[128];
    //     for(char ch : s.toCharArray())
    //     {
    //         freq[ch]++;
    //     }

    //     List<Character> characters = new ArrayList<>();
    //     for(char ch = 0; ch < 128; ch++)
    //     {
    //         if(freq[ch] > 0)
    //         {
    //             characters.add(ch);
    //         }
    //     }

    //     Collections.sort(characters, ((a, b) -> freq[b] - freq[a]));
    //     StringBuilder sb = new StringBuilder();
    //     for(char ch : characters)
    //     {
    //         for(int i = 0; i < freq[ch]; i++)
    //         {
    //             sb.append(ch);
    //         }
    //     }
    //     return sb.toString();
    // }

    //Using Bucket sort - n+k
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for(char ch : s.toCharArray())
        {
            freq[ch]++;
        }

        List<Character>[] buckets = new ArrayList[s.length() + 1];
        for(int i = 0; i <= s.length(); i++)
        {
            buckets[i] = new ArrayList<>();
        }

        for(int i = 0; i < 128; i++)
        {
            if(freq[i] > 0)
            {
                buckets[freq[i]].add((char)i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = buckets.length - 1; i > 0; i--)
        {
            for(char ch : buckets[i])
            {
                for(int j = 0; j < i; j++)
                {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
