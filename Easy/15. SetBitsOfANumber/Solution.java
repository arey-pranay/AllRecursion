import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int log2n = (int) (Math.log(n) / Math.log(2));
    System.out.println(convert(n, log2n, 0, 0));
  }

  public static int convert(int n, int p, int curr, int count) {
    if (p == -1)
      return count;
    int max = (int) Math.pow(2, p);
    curr *= 10;
    if (max <= n) {
      count++;
      return convert(n - max, --p, ++curr, count);
    } else {
      return convert(n, --p, curr, count);
    }
  }

}
