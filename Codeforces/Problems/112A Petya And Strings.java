import java.util.*;
public class Siddharth{
    public static void main(String[] args){
      // your code goes here
      Scanner s = new Scanner(System.in);
      String s1 = s.next();
      String s2 = s.next();
      String lower_s1 = s1.toLowerCase();
      String lower_s2 = s2.toLowerCase();
      int flag = 0;
      for(int i = 0; i < lower_s1.length(); i++){
          if(lower_s1.charAt(i) > lower_s2.charAt(i)){
              flag = 1;
              break;
          }
          else if(lower_s1.charAt(i) < lower_s2.charAt(i)){
              flag = -1;
              break;
          }
      }
      System.out.println(flag);
    }
}
