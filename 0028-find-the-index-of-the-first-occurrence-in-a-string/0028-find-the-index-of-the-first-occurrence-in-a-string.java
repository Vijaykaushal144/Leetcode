class Solution {
    public int strStr(String haystack, String needle) {
            
        //return haystack.indexOf(needle);
        
        int n= haystack.length();
        int m= needle.length();
        
        if(n<m ) return -1;
        for(int i=0;i<=n-m;i++)
        {        int ptr2=0;
            while(ptr2<m && haystack.charAt(i+ptr2)==needle.charAt(ptr2))
                ptr2++;
                
                if(ptr2==m) return i;
        }
        return -1;
        
    }
}