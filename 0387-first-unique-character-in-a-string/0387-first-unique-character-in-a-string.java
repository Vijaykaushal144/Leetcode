class Solution {
    public int firstUniqChar(String s) {
//         int result=Integer.MAX_VALUE;
//         for(char c='a';c<='z';c++)
//         {
//             int index=s.indexOf(c);
//             if(index!=-1 && index==s.lastIndexOf(c))
//                 result=Math.min(result,index);
//         }
        
//         return result==Integer.MAX_VALUE?-1:result;
        
        int freq[]= new int[26];
        for(char index:s.toCharArray())
        {
            freq[index-'a']+=1;
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
        
        
    }
}