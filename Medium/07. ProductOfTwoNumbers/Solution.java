import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println(calc(x, y, 0));
  }

  public static int calc(int x, int y, int res) {
    if (y == 0)
      return res;
    res += x;
    return calc(x, --y, res);
  }
}
