class Solution {
    public int getSum(int a, int b) {
       
//         while(b!=0)
//         {
//             int carry=a&b;
//             a=a^b;
//             b=carry<<1;
           
//         }
       // return a;
    
    //second approach
    
    int xor=a^b;
    int carry=a&b;
    if(carry==0) return xor;
    else  return getSum(xor,carry<<1);
}
}