class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int input[], int n){
        // Your code here
        //JAI SHRI RAM 
        int k = 0;
        int[] res = new int[100000];
        int maxEle = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--){
            if(input[i] >= maxEle){
                maxEle = input[i];
            }
            if(maxEle == input[i]){
                res[k++] = input[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = k-1; i >= 0; i--){
            list.add(res[i]);
        }
        return list;
    }
}
