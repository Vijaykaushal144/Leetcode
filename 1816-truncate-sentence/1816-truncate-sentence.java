class Solution {
    public String truncateSentence(String s, int k) {
        // char c[]= new char[k];
        // //char p[]=s.toString();
        // for(int i=0;i<k;i++)
        // {
        //     c[i]=s.charAt(i);
        // }
        // return new String(c);
        
        
        String []str=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<k-1;i++)
        {
            sb.append(str[i]+" ");
        }
        //remove last space
        sb.append(str[k-1]);
        return sb.toString();
    }
}