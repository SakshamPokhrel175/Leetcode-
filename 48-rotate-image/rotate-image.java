class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            reverseRow(matrix[i]);
        }
        
    }


    private static void reverseRow(int[] row){
        int left=0;
        int right=row.length-1;

        while(left<right){
            int temp=row[left];
            row[left]=row[right];
            row[right]=temp;
            left++;
            right--;
        }
    }

   public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) { 
            System.out.print(matrix[i][j] + " "); 
        }
        System.out.println(); 
    }
}



}