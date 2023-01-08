class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        //JAI SHRI RAM 
        int i = 0, j = 0; 
        int cntr = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i < n && j < m){
            while(i < n-1 && a[i] == a[i+1])
                i++;
            while(j < m-1 && b[j] == b[j+1])
                j++;
            if(a[i] == b[j]){
                cntr++;
                i++;
                j++;
            }
            else if(a[i] > b[j]){
                cntr++;
                j++;
            }
            else{
                cntr++;
                i++;
            }
        }
        while(i < n){
            while(i < n-1 && a[i] == a[i+1])
                i++;
            cntr++;
            i++;
        }
        while(j < m){
            while(j < m-1 && b[j] == b[j+1])
                j++;
            cntr++;
            j++;
        }
        return cntr;
    }
}
