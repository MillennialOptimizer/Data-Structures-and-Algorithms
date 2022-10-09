public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int firstMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstMax)
                firstMax = arr[i];
        }
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != firstMax){
                if(secondMax < arr[i])
                    secondMax = arr[i];
            }
        }
        return secondMax;
    }

}
