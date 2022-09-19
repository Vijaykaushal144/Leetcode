class Solution {
    public boolean isHappy(int n) {
        List<Integer> st=new ArrayList<Integer>();
        while(n!=1)
        {
            int temp=n;
            n=0;
            while(temp>0)
            {
                n=n+(int)Math.pow((temp%10),2);
                temp=temp/10;
            }
                if(st.contains(n))
                    return false;
                else
                    st.add(n);
            
        }
        return true;
    }
}