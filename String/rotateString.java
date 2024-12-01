class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
        // ab.cdeab.cde
    }


    // // O(n^2) because
    // // substring operation takes O(n)
    // // Equals opearation also takes O(n)
    // public boolean rotateString(String s, String goal) {
    //     if(s.length() != goal.length())
    //     {
    //         return false;
    //     }

    //     String rotated = s;
    //     int n = s.length();

    //     for(int i = 0; i < n; i++)
    //     {
    //         rotated = rotated.substring(1) + rotated.charAt(0);
    //         if(rotated.equals(goal))
    //         {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
