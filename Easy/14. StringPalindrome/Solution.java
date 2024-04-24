import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Boolean flag = true;
    System.out.println(calc(s, flag, 0, s.length() - 1));
  }

  public static boolean calc(String s, Boolean flag, int i, int j) {
    if (i >= j) {
      return true;
    }
    if (s.charAt(i) != s.charAt(j)) {
      return false;
    }
    return calc(s, flag, ++i, --j);
  }

}
