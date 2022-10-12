class Solution
{
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    //Function to rotate an array by d elements in counter-clockwise direction.
    static void reverse(int[] arr, int l, int r){
        while(r >= l){
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            r--;
            l++;
        }
    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d = d%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-d-1);
        reverse(arr, n-d, n-1);
    }
}
