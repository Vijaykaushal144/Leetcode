//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(a[i]);

            Solution ob = new Solution();
            System.out.println(ob.isPossible(N, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
        int res = 0;
        for (int i = 0; i < N ; i++){
            res+=helper(arr[i]);
        }
        if (res % 3 == 0)
        return 1;
        else
        return 0;
    }
    static int helper(int num){
        int res = 0;
        while(num > 0){
            res+=num%10;
            num/=10;
        }
        return res;
    }
}