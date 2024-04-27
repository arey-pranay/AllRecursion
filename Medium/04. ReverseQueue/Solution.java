import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    for (int i = 0; i < size; i++) {
      q.add(sc.nextInt());
    }
    rev(q);
    System.out.println(q);
  }

  public static void rev(Queue<Integer> q) {
    if (q.size() == 0)
      return;
    int temp = q.remove();
    rev(q);
    q.add(temp);
    return;
  }
}
