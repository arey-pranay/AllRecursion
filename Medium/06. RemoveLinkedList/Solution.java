import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    LinkedList<Integer> l = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    while (true) {
      int temp = sc.nextInt();
      if (temp == -1)
        break;
      l.add(temp);
    }
    System.out.println(l);
    calc(l);
    System.out.println(l);
  }

  public static void calc(LinkedList<Integer> l) {
    if (l.size() == 0)
      return;
    l.removeFirst();
    calc(l);
  }

}
