import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sz = sc.nextInt();
    int[] arr = new int[sz];
    for (int i = 0; i < sz; i++) {
      arr[i] = sc.nextInt();
    }
    int min = arr[0];
    int max = arr[0];
    calc(min, max, arr, 0);
    System.out.println();
  }

  public static void calc(int min, int max, int[] arr, int i) {
    if (i == arr.length) {
      System.out.println("Max is " + max);
      System.out.println("Min is " + min);
      return;
    }
    calc(Math.min(min, arr[i]), Math.max(max, arr[i]), arr, ++i);
    return;
  }
}
