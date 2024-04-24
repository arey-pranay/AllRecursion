import java.util.*;

public class Solution {
  public static void main(String args[]) {
    fibo(new Scanner(System.in).nextInt(), 0, 1);
  }

  public static void fibo(int n, int a, int b) {
    if (n == 0)
      return;
    fibo(n - 1, b, a + b);
    System.out.print(a + " ");
  }
}