class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls= new ArrayList<Integer>();
        int i,k=0,l=0;
        int row=matrix.length;
        int col=matrix[0].length;
        while(k<row && l<col)
        {
            for(i=l;i<col;i++)
            {
                ls.add(matrix[k][i]);
            }
            k++;
            for(i=k;i<row;i++)
            {
                ls.add(matrix[i][col-1]);
            }
            col--;
            if(k<row)
            {
                for(i=col-1;i>=l;i--)
                {
                    ls.add(matrix[row-1][i]);
                }
                row--;
            }
            if(l<col)
            {
                for(i=row-1;i>=k;i--)
                {
                 ls.add(matrix[i][l]) ;  
                }
                l++;
            }
        }
        return ls;
        
    }
}