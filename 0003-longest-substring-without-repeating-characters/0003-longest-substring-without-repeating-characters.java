class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> hs= new HashSet<>();
        int left=0;
        int right=0;
        int max=0;
        while(right<s.length())
        {
            if(!hs.contains(s.charAt(right)))
            {
                hs.add(s.charAt(right));
                right++;
                max= Math.max(max,hs.size());
            }
            else
            {
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}