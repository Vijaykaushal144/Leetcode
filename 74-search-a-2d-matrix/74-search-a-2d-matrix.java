class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //int row=0;
        // int column=matrix[0].length-1;
        // while(row<matrix.length && column>=0)
        // {
        //     if(matrix[row][column]==target)
        //         return true;
        //     else if(matrix[row][column]>target)
        //         column--;
        //     else
        //         row++;
        // }
        // return false;
        
       //  int row=matrix.length;
       //  int column=matrix[0].length;
       //  int st=0;
       //  int end=(row*column)-1;
       // int  mid=st+(end-st)/2;
       //  while(st<=end)
       //  {
       //      int element=matrix[mid/column][mid%column];
       //      if(element==target)
       //      {
       //          return true;
       //      }
       //      if(element<target)
       //      {
       //          st=mid+1;
       //      }
       //      if(element>target)
       //      {
       //          end=mid-1;
       //      }
       //      mid=st+(end-st)/2;
       //  }
       //  return false;
        for(int i=0;i<=matrix.length-1;i++)
        {
            for(int j=0;j<=matrix[0].length-1;j++)
                
            {
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }
}