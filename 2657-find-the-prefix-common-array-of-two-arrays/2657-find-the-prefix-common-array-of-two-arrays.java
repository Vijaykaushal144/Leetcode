class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
//         int third[]= new int[A.length];
        
//         for(int i=0;i<A.length;i++)
//         {
//             boolean check=false;
//             for(int j=0;j<B.length;j++)
//             {
//                 if(A[i]==B[j])
//                 {
//                     check=true;
//                 }
                
//                 if(check && j>=i)
//                 {
//                     third[j]++;
//                 }
//             }
//         }
        
//         return third;
        
        int third[]= new int[A.length];
        int freq[]= new int[A.length+1];
        
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            freq[A[i]]++;
            if(freq[A[i]]==2) count++;
            
            freq[B[i]]++;
            if(freq[B[i]]==2) count++;
            
            third[i]=count;
            
        }
        return third;
        
        
       
        
    }
}