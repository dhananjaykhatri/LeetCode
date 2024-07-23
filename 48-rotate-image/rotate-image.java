class Solution 
{
    public void rotate(int[][] matrix) 
    {
        int[] temp = new int[matrix[0].length];
        int j=matrix.length-1;
        for(int i=0;i<matrix.length/2;i++)
        {
            temp = matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            j--;
        }
        int summa=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(j=i;j<matrix[0].length;j++)
            {
                summa = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=summa;
            }
        }
    }
}