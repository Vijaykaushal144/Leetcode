class Solution {
    public String reverseWords(String s) {
        char c[]=s.toCharArray();
        int left=0;
        int right=0;
        while(left<s.length())
        {
            while(right<s.length() && c[right]!=' ')
            {
                right++;
            }
            reverse(c,left,right-1);
            left=right+1;
            right=left;
        }
        return new String(c);  
    }
    
   void reverse(char [] str,int i,int j)
   {
       while(i<j)
       {
           char temp=str[i];
           str[i++]=str[j];
           str[j--]=temp;
       }
   }
}