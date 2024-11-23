class Solution {
    public char[][] rotateTheBox(char[][] box) {
        
        int m = box.length;
        int n = box[0].length;

        for(int row = 0 ; row < m ; row++){

            for(int col = n - 1 ; col >= 0 ; col--){

                if((box[row][col] == '#')){

                    int empty = col + 1;

                    while(empty < n && box[row][empty] == '.'){

                        empty ++;

                    }

                    if(empty - 1 < n && box[row][empty - 1] == '.'){

                        box[row][empty - 1] = '#';
                        box[row][col] = '.';

                    }
                }
            }
        }

        char[][] result = new char[n][m];

        int k = m - 1;

        for(int i = 0 ; i < m ; i++){

            for(int j = 0 ; j < n ; j++){

                result[j][k] = box[i][j];

            }

            k--;

        }

        return result;

    }
}