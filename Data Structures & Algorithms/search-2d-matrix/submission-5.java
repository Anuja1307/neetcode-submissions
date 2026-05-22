class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int ROWS=matrix.length-1;
        int COLS=matrix[0].length-1;

        int top=0;
        int bot=ROWS;

        while(top<=bot){
            int row=top+(bot-top)/2;
            if(target>matrix[row][COLS]){
                top=row+1;
            }
            else if(target<matrix[row][0]){
                bot=row-1;
            }
            else{
                break;
            }
        }

        if(!(top<=bot)){
            return false;
        }

        

        int row=top+(bot-top)/2;
        int s=0;
        int e=COLS;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>matrix[row][mid]){
                s=mid+1;
            }
            else if(target<matrix[row][mid]){
                e=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}
