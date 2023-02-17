class Solution {
    public boolean isPalindrome(String s) {
       int sp=0;
        int en=s.length()-1;
        while(sp<en)
        {
            char stchar=s.charAt(sp);
            char endchar=s.charAt(en);
            if(!Character.isLetterOrDigit(stchar))
            {
                sp++;
            }
            else if(!Character.isLetterOrDigit(endchar))
            {
                en--;
            }
            else
            {
                if(Character.toLowerCase(stchar)!=Character.toLowerCase(endchar))
                {
                    return false;
                }
                sp++;en--;
            }
            
        }
        return true;
    }
}