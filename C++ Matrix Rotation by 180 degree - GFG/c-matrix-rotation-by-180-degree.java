//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            ob.rotate(matrix);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void  rotate(int[][] matrix)
    {
        // code here
        // reverse each column
        int row= matrix.length;
        int col= matrix[0].length;
        for(int j=0;j<col;j++)
        {
            int st=0;int end=col-1;
            while(st<=end)
            {
                int temp= matrix[st][j];
                matrix[st][j]= matrix[end][j];
                matrix[end][j]= temp;
                st++;end--;
            }
            
        }
        
        //row wise reverse
        
        for(int i=0;i<row;i++)
        {
            int st=0;int end=row-1;
            while(st<=end)
            {
                int temp= matrix[i][st];
                matrix[i][st]= matrix[i][end];
                matrix[i][end]= temp;
                st++;end--;
            }
            
        }
        
        
        
        
    }
}
