class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int start=0,end=0,ans=0,count=0,n=s.length();
        
        //Checking the max consecutive F possible if we can change at max K 'T'
        while(end<n)
        {
            char ch=s.charAt(end);
            if(ch=='T')//Count the number of 'T'encountered
                ++count;
            while(count>k)//If count>'T'then we need to move start and decrease 
                            // the number of 'T'so that count<=K
                if(s.charAt(start++)=='T')
                    --count;
            ans=Math.max(ans,end-start+1);//We update the length of the ans
            ++end;
        }
        end=0;
        start=0;
        count=0;
        //Cheching the max consecutive T possible if we can change at max K'F'
        while(end<n)
        {
            char ch=s.charAt(end);
            if(ch=='F')
                ++count;
            while(count>k)
                if(s.charAt(start++)=='F')
                    --count;
            ans=Math.max(ans,end-start+1);
            ++end;
        }
        return ans;
    }
}