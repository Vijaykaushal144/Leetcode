class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hs= new HashMap<>();
        for(int p: nums)
        {
            hs.put(p,hs.getOrDefault(p,0)+1);
        }
        for(Map.Entry<Integer,Integer> ent:hs.entrySet())
        {
            if(ent.getValue()!=3) return ent.getKey();
        }
        return -1;
        
    }
}