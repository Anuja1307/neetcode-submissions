class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int row=0;row<9;row++){
            HashSet<Character> rows =new HashSet<>();
            for(int i=0;i<8;i++){
                if(board[row][i]=='.'){
                    continue;
                }
                else{
                    if(!rows.contains(board[row][i])){
                        rows.add(board[row][i]);

                    }
                    else{
                        return false;
                    }

                }

            }

        }

        for(int col=0;col<9;col++){
            HashSet<Character> cols=new HashSet<>();
            for(int i=0;i<8;i++){
                if(board[i][col]=='.'){
                    continue;
                }
                else{
                    if(!cols.contains(board[i][col])){
                        cols.add(board[i][col]);
                    }
                    else{
                        return false;
                    }
                }

            }

        }

        for(int square=0;square<9;square++){
            HashSet<Character> sq=new HashSet<>();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row=(square/3)*3+i;
                    int col=(square%3)*3+j;
                    if(board[row][col]=='.'){
                        continue;
                    }
                    else{
                        if(!sq.contains(board[row][col])){
                            sq.add(board[row][col]);
                        }
                        else{
                            return false;
                        }
                    }
                }
            }
        }
        return true;
        
    }
}
