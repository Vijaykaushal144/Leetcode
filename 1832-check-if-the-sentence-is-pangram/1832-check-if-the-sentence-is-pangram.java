class Solution {
    public boolean checkIfPangram(String s) {
        boolean count[]= new boolean[26];
        for(char c:s.toCharArray())
        {
            count[c-'a']=true;
        }
        for(int i=0;i<26;i++)
        {
            if(!count[i]) return false;
        }
        return true;
    }
}