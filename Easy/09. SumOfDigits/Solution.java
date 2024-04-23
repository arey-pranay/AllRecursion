import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(calc(sc.nextInt(), 0));
  }

  public static int calc(int ip, int sum) {
    if (ip == 0)
      return sum;
    return calc(ip / 10, sum + ip % 10);
  }
}
