import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(calc(s, ""));
  }

  public static String calc(String s, String prev) {
    // if current and previously called strings are same, then you can return safely
    if (prev.compareTo(s) == 0)
      return s;
    // for this call, set the prev string as the currently called string
    prev = s;
    // store the size of current string to simplify calculations
    int size = s.length();

    // if 0 or 1 character is left then just return, otherwise you will get out of
    // bounds exception for checking its neighbors
    if (size == 1 || size == 0)
      return prev;
    // check the 0th and 1st character and call the function if they get matched
    if (prev.charAt(0) == prev.charAt(1))
      return calc(prev.substring(2), prev);
    // check the remaining paris except the last one and call if you find adjacent
    // duplicate
    for (int i = 1; i < size - 1; i++) {
      if (prev.charAt(i) == prev.charAt(i - 1)) {
        s = prev.substring(0, i - 1) + prev.substring(i + 1, size);
        return calc(s, prev);
      }
    }
    // check for the last pair of characters of the string s
    if (s.charAt(size - 1) == s.charAt(size - 2))
      return calc(s.substring(0, size - 2), prev);
    // return anything here
    return s;
  }
}
