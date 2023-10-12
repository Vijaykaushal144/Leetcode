//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
       String[] s = S.split("\\.");
    int st = 0;
    int end = s.length - 1; // Corrected the end index

    while (st < end) {
        String temp = s[st];
        s[st] = s[end];
        s[end] = temp;
        st++;
        end--;
    }

    // Join the array elements into a single string with dots
    String ans = String.join(".", s);

    return ans;
        
        // code here 
    }
}