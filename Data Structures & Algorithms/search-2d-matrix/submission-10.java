class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int ROWS=matrix.length;
        int COLS=matrix[0].length;


        int s=0;
        int e=ROWS*COLS-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            int row=mid/COLS;
            int col=mid%COLS;

            if(target>matrix[row][col]){
                s=mid+1;
            }
            else if(target<matrix[row][col]){
                e=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}
