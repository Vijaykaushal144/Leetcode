class Solution {
    public boolean containsDuplicate(int[] n) 
    {
        Arrays.sort(n);
       
        //int n=nums.length;
        for(int i=0;i<n.length-1;i++){
            if(n[i]==n[i+1]){
                return true;
            }
        }
        return false;
    }
}