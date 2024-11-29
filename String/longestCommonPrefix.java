class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        // String[] arr = {"flower", "flow", "flight", "z"};
        // Arrays.sort(arr);
        // System.out.println("Sorted Array: " + Arrays.toString(arr));
        // Sorted Array: [flight, flow, flower, z]
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for(int i = 0; i < Math.min(first.length(), last.length()); i++)
        {
            if(first.charAt(i) != last.charAt(i))
            {
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}
