class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int result=0;
        int si=0;
        for(int i=0;i<gas.length;i++)
        {
            total=total+gas[i]-cost[i];
            result=result+gas[i]-cost[i];
            if(total<0){
                total=0;si=i+1;
            }
        }
        if(result<0)
            return -1;
        return si;
    }
}