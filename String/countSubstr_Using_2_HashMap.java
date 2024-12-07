//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(new Solution().countSubstr(s, k));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public static void removeInMap(HashMap<Character, Integer> map, char ch)
    {
        if(map.get(ch) == 1)
        {
            map.remove(ch);
        }
        else
        {
            map.put(ch, map.get(ch) - 1);
        }
    }
    
    int countSubstr(String s, int k) {
        int ans = 0;
        
        if(k == 1)
        {
            HashMap<Character, Integer> map = new HashMap<>();
            int i = -1;
            int j = -1;
            
            while(true)
            {
                boolean f1 = false;
                boolean f2 = false;
                while(i < s.length() - 1)
                {
                    f1 = true;
                    i++;
                    char ch = s.charAt(i);
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                    
                    if(map.size() == 2)
                    {
                        removeInMap(map, ch);
                        i--;
                    }
                }
                
                while(j < i)
                {
                    f2 = true;
                    if(map.size() == 1)
                    {
                        ans += i -j;
                    }
                    
                    j++;
                    char ch = s.charAt(j);
                    removeInMap(map, ch);
                    
                    if(map.size() == 0)
                    {
                        break;
                    }
                }
                if(f1 == false && f2 == false)
                {
                    break;
                }
            }
            
        }
        else
        {
        
        int ib = -1;
        int is = -1;
        int j = -1;
        
        HashMap<Character, Integer> mapb = new HashMap<>();
        HashMap<Character, Integer> maps = new HashMap<>();
        
        while(true)
        {
            boolean f1 = false;
            boolean f2 = false;
            boolean f3 = false;
            while(ib < s.length() - 1)
            {
                f1 = true;
                ib++;
                char ch = s.charAt(ib);
                mapb.put(ch, mapb.getOrDefault(ch, 0) + 1);
                
                if(mapb.size() > k)
                {
                    removeInMap(mapb, ch);
                    ib--;
                    break;
                }
            }
            
            while(is < ib)
            {
                f2 = true;
                is++;
                char ch = s.charAt(is);
                maps.put(ch, maps.getOrDefault(ch, 0) + 1);
                
                if(maps.size() == k)
                {
                    removeInMap(maps, ch);
                    is--;
                    break;
                }
            }
            
            while(j < is)
            {
                f3 = true;
                if(mapb.size() == k && maps.size() == k - 1)
                {
                    ans += ib - is;
                }
                j++;
                char ch = s.charAt(j);
                removeInMap(mapb, ch);
                removeInMap(maps, ch);
                
                if(mapb.size() < k || maps.size() < k - 1)
                {
                    break;
                }
            }
            
            if(f1 == false && f2 == false && f3 == false)
            {
                break;
            }
        }
        }
        return ans;
    }
}
