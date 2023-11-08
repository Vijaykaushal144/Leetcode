class Solution {
    public String defangIPaddr(String address) {
       int idx=0;
       
//         while(idx<address.length())
//         {
//             if(address.charAt(idx)=='.')
//             {
//                 address.replace(".","[.]");
//             }
           
//             idx++;
//         }
        return address.replace(".","[.]");

    }
}