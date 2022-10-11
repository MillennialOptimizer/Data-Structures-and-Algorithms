class Solution{
    
  
    String calc_Sum(int a[], int n, int b[], int m)
    {
        // Complete the function
        int i = n - 1, j = m - 1; 
        int carry = 0; 
        StringBuilder s = new StringBuilder(); 
        while(i >= 0 && j >= 0){
            int sum = a[i] + b[j] + carry; 
            s.append((char)((sum%10) + '0'));
            carry = sum/10;
            i--;
            j--;
        }
        while(i >= 0){
            int sum = a[i] + carry; 
            s.append((char)((sum%10) + '0'));
            carry = sum/10;
            i--;
        }
        while(j >= 0){
            int sum = b[j] + carry; 
            s.append((char)((sum%10) + '0'));
            carry = sum/10;
            j--;
        }
        if(carry != 0)
        {
            s.append((char)(carry + '0'));
        }
        s.reverse();
        // eliminate zeroes in the start
        StringBuilder s1 = new StringBuilder();
        int ind = 0; 
        while(ind < s.length() && s.charAt(ind) == '0'){
            ind++;
        }
        while(ind < s.length()){
            s1.append(s.charAt(ind));
            ind++;
        }
        String res = new String(s1);
        return res;
    }
  
    
}
