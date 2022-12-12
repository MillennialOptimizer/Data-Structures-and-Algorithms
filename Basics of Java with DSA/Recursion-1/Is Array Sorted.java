class Solution {
    public static boolean checkTillIndex(int[] arr, int i){
        if(i == 0){
            return true;
        }
        boolean prevSorted = checkTillIndex(arr, i-1);
        if(prevSorted && arr[i] >= arr[i-1])
            return true;
        return false;
    }
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        return checkTillIndex(arr, n-1);
    }
}
