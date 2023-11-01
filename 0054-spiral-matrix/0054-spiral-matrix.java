class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ls= new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int left= 0;int right=col-1;
        int top=0; int bottom= row-1;
        while(left<=right && top<=bottom)
        {
            // left to right
            for(int i=left;i<=right;i++)
            {
                ls.add(matrix[top][i]);
            }
            top++;
            //top to bottom 
            for(int i=top;i<=bottom ;i++)
            {
                ls.add(matrix[i][right]);
                    
            }
            right--;
            
            
            if(top<=bottom)
            {
               // right to left
                for(int i= right;i>=left;i-- )
                {
                    ls.add(matrix[bottom][i]);
                   
                }
                bottom--;
            }
            if(left<=right)
            {
                //bottom to up
                for(int i=bottom;i>=top;i--)
                {
                    ls.add(matrix[i][left]);
                    
                }
                left++;
            }
        }
        return ls;
    }
}