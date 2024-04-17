import java.util.Scanner;
public class Solution{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sum(n));
  }
  public static int sum(int n){
    if(n==0) return 0;
    return n +  sum(n-1);
  }
}