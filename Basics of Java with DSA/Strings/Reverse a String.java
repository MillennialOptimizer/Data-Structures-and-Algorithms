class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String s)
    {
        // Reverse the string str
        String str = "";
        int n = s.length();
        for(int i = n-1; i >= 0; i--){
            str += ("" + s.charAt(i)); 
        }
        return str;
    }
}
