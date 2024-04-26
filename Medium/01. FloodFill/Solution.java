import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    int arr[][] = {
        { 1, 2, 1, 1, 1, 1, 1, 1 },
        { 1, 1, 1, 1, 1, 1, 0, 0 },
        { 1, 0, 0, 1, 1, 0, 1, 1 },
        { 1, 2, 2, 2, 2, 0, 1, 0 },
        { 1, 1, 1, 2, 2, 0, 1, 0 },
        { 1, 1, 1, 2, 2, 2, 2, 0 },
        { 1, 1, 1, 1, 1, 2, 1, 1 },
        // { 1, 1, 1, 1, 1, 2, 2, 1 }
    };
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int c = sc.nextInt();
    calc(arr, x, y, c, arr[x][y]);
    System.out.println();
    for (int[] i : arr) {
      for (int temp : i) {
        System.out.print(temp + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void calc(int[][] arr, int x, int y, int c, int value) {
    // no more assignment possible, out of bound
    if (x == arr.length || y == arr[0].length || x == -1 || y == -1)
      return;
    // assign the current block as c
    arr[x][y] = c;
    // check left neighbor
    if (x != 0 && arr[x - 1][y] == value)
      calc(arr, x - 1, y, c, value);
    // check right neighbor
    if (x != arr.length - 1 && arr[x + 1][y] == value)
      calc(arr, x + 1, y, c, value);
    // check bottom neighbor
    if (y != 0 && arr[x][y - 1] == value)
      calc(arr, x, y - 1, c, value);
    // check top neighbor
    if (y != arr[0].length - 1 && arr[x][y + 1] == value)
      calc(arr, x, y + 1, c, value);
    // if all neighbors checked, then return.
    return;
  }
}
