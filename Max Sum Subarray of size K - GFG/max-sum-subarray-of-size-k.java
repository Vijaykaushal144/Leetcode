//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
      long ans =Integer.MIN_VALUE;
    int st=0;
    long sum=0;
    int end=0;
    while(end<N)
    {
        sum+=Arr.get(end);
        if((end-st+1)<K) end++;
        else if((end-st+1)==K)
        {
            ans=Math.max(ans,sum);
            sum-=Arr.get(st);
            st++;end++;
        }
    }
    return ans;
    }
}