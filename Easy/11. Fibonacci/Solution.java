import java.util.HashSet;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashSet<Integer> h = new HashSet<>();
    calc(n, 0, h);
    System.out.println(h);
  }

  public static int calc(int n, int curr, HashSet<Integer> h) {
    if (n == 0 || n == 1) {
      h.add(1);
      return 1;
    }
    curr += calc(--n, curr, h) + calc(--n, curr, h);
    h.add(curr);
    return curr;
  }
}
