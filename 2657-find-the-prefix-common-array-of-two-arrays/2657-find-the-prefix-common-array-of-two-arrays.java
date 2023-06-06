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
        int frequency[]= new int[A.length+1];
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            frequency[A[i]]++;
            if(frequency[A[i]]==2) count++;
            frequency[B[i]]++;
            if(frequency[B[i]]==2) count++;
            third[i]=count;
            
            
        }
        return third;
        
    }
}