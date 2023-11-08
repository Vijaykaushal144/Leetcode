class Solution {
    public String defangIPaddr(String address) {
       
       // return address.replace(".","[.]");
        
        StringBuffer res= new StringBuffer();
        int idx=0;
       
          while(idx<address.length())
         {
              if(address.charAt(idx)=='.')
            {
                res.append("[.]");
            }
              else res.append(address.charAt(idx));
           
            idx++;
        }
       return res.toString();

    }
}