
//tail recursion means the recursive call is made after the task of the current call is done. like n to 1 printing.
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sz = sc.nextInt();
    int[] arr = new int[sz];
    for (int i = 0; i < sz; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(calc(0, 0, arr));
  }

  public static int calc(int sum, int i, int[] arr) {
    if (i == arr.length)
      return sum;
    return calc(sum + arr[i], ++i, arr);
  }
}
