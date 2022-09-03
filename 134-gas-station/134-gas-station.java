class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int result=0;
        int index=0;
        for(int i=0;i<cost.length;i++)
        {
            total=total+gas[i]-cost[i];
            result=result+gas[i]-cost[i];
            if(total<0) 
            {
                total=0;
                index=i+1;
            }
        }
        if(result<0)
            return -1;
        
        return index;
    }
}