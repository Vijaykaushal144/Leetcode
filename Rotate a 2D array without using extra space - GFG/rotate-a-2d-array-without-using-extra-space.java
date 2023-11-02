//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * n + j]);
                }
            }

            new Solution().rotateMatrix(arr, n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.print(arr[i][j] + " ");
                }
            }
            out.println();
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    void rotateMatrix(int arr[][], int n) {
        // code here
        //tranpose matrix 
        int row= arr.length;
        int col= arr[0].length;
        for(int i=0;i<row-1;i++)
        {
            for(int j=i+1;j<col;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]= temp;
            }
        }
        
        //reverse column wise 
        
        for(int j=0;j<col;j++)
        {
            int st=0;int end= col-1;
            while(st<=end)
            {
                int temp=arr[st][j];
                arr[st][j]=arr[end][j];
                arr[end][j]= temp;
                st++;end--;
            }
        }
    }
}