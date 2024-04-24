import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(calc(n));
  }

  public static int calc(int n) {
    if (n == 0)
      return 1;
    return n * calc(n - 1);
  }
}
