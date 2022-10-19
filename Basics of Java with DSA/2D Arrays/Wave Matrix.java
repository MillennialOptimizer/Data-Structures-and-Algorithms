
public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        boolean down = true; 
        int row = mat.length; 
        if(row == 0)
            return;
        int col = mat[0].length; 
        for(int i = 0; i < col; i++){
            if(down == true){
                for(int j = 0; j < row; j++){
                    System.out.print(mat[j][i] + " ");
                }
                down = false;
            }
            else{
                for(int j = row-1; j >= 0; j--){
                    System.out.print(mat[j][i] + " ");
                }
                down = true;
            }
        }
	}

}
