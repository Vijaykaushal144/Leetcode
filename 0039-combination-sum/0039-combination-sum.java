class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        LinkedList<Integer> comb=new LinkedList<Integer>();
        this.backtrack(target,comb,0,candidates,result);
        return  result;
    }
     private void backtrack(int remain,LinkedList<Integer> comb,int start,int [] candidate,List<List<Integer>> result)
     {
         if(remain==0)
         {
             result.add(new ArrayList<Integer> (comb));
             return;
         }
         else if(remain<0)
            return;

            for(int i=start;i<candidate.length;i++)
            {
                comb.add(candidate[i]);
                this.backtrack(remain-candidate[i],comb,i,candidate,result);
                comb.removeLast();
            }
     }
}