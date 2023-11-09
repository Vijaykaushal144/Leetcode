class Solution {
    public int longestPalindrome(String s) {
//         int []freq= new int[256];
//         for(char c:s.toCharArray()){
//             freq[c]++;
//         }

//         int oddfreq=-1;
//         for(int i:freq)
//         {
//             if(i%2!=0) oddfreq++;
//         }
//         return oddfreq>0? s.length()-oddfreq:s.length();
        
        
        int small[]= new int[26];
        int capital[]= new int[26];
        for(char c:s.toCharArray())
        {
            if(c>='a')
            {
                small[c-'a']++;
            }
            else capital[c-'A']++;
        }
        boolean flag= false;
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(small[i]%2==0) count+=small[i];
            else {
                flag= true;
                count+=small[i]-1;
            }
            if(capital[i]%2==0) count+=capital[i];
            else
            {
                count+=capital[i]-1;
                flag=true;
            }
        }
        if(flag){
        return count+1;}
        return count;
        
    }
}