class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!= goal.length())
        {
            return false;
        }
        if(s.equals(goal))
        {
            
            //freaquency isliye bcz ex abcda ,abcda a ko swap kr skte h;
            
            return checkFreq(s);
        }
        // now find  index in which index  we have to swap string.
        List<Integer> ls= new ArrayList<Integer>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=goal.charAt(i))
            {
                //hme wo vlue mil jayegi janaha pe character equal nhi honge
                ls.add(i);
            }
        }
        if(ls.size()!=2) return false;
        
        String afswap= swap(ls.get(0),ls.get(1),s);
        
        if(afswap.equals(goal)) return true;
        
        return false;
        
    }
    public static String swap(int i,int j,String s)
    {
        char a[]= s.toCharArray();
        char temp=a[i];
        a[i]=a[j];
        a[j]= temp;
        
        StringBuilder sb= new StringBuilder();
        for(int idx=0;idx<a.length;idx++){
            sb.append(a[idx]);
        }

        return sb.toString();
    }
    private boolean checkFreq(String s){

        int freq[]=new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;

            if(freq[ch-'a']>1){
                return true;
            }
        }
        return false;
    }
}