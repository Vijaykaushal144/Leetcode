class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            String  s= operations[i];
            int k=1;
            if(s.charAt(k)=='+') x=x+1;
            else x=x-1;
        }
        return x;
        
    }
}