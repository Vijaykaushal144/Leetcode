class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> sublist= new ArrayList<>();
        boolean []visit= new boolean[nums.length];
        recursion(res, sublist,nums,visit);
        
        return res;   }
    
    
    public void recursion(List<List<Integer>> list, List<Integer> sublist, int nums[], boolean[] visited)
    {
        if(sublist.size()==nums.length)
        {
            list.add(new ArrayList(sublist));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]==true)
                continue;
            sublist.add(nums[i]);
            visited[i]=true;
            recursion(list,sublist,nums,visited);
            sublist.remove(sublist.size()-1);
            visited[i]=false;
        }
    }
}