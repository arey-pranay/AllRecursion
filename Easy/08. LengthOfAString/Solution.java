import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int i=0;
    
    System.out.println(calc(s,i));
  }
  public static int calc(String s, int i){
    if(s.isEmpty()) return i;
    i++;
    return 1+   calc(s.substring(i), i);
  }
}
