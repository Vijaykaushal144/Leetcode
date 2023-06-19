class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int distance=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals(target))
            {
                distance=Math.min(distance,Math.min(Math.abs(i-startIndex),words.length-Math.abs(i-startIndex)));
            }
                
        }
        if(distance==Integer.MAX_VALUE) return -1;
        return distance;
        
        
        
    }
}