class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        
        List<List<Integer>> ans= new ArrayList<>();
        findCombination(0,c,target,ans, new ArrayList());
        return ans;
       
    }
    public static void findCombination(int idx,int c[],int target,
                                       List<List<Integer>> ans, List<Integer> ds)
    {
        if(idx==c.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
                return ;
            }
            return;
        }
        if(c[idx]<=target)
        {
            ds.add(c[idx]);
            findCombination(idx,c,target-c[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(idx+1,c,target,ans,ds);
    }
}