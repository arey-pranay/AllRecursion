import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String curr = "";
    System.out.println(rev(s,curr,s.length()-1));
  }
  public static String rev(String s, String curr,  int i){
    if(i==-1) return curr;
    curr += s.charAt(i--);
    return rev(s, curr, i);
  }
}
