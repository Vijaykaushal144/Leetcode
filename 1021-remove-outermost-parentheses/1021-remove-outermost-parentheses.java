class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sp=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(') count++;
            else  count--;
            if((c=='('&& count==1) || (c==')' &&count==0))
                continue;
            
            sp.append(c);
            
            
                
        }
        return sp.toString();
        
    }
}