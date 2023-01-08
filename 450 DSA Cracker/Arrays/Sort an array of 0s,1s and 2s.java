class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        //JAI SHRI RAM 
        int low = 0, mid = 0, high = n-1; 
        while(mid <= high){
            if(a[mid] == 0){
                // swap(a[mid], a[low])
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1){
                mid++;
            }
            else{
                // swap(a[mid], a[high])
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
        
    }
}
