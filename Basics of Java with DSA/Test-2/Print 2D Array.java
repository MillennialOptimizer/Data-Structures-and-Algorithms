public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
		//JAI SHRI RAM 
        int m = input.length; 
        if(m == 0)
            return;
        int n = input[0].length; 
        for(int i = 0; i < m; i++){
            for(int k = 0; k < m-i; k++){
                for(int j = 0; j < n; j++){
                    System.out.print(input[i][j] + " ");
                }
                System.out.println("");
            }
        }
	}
}
