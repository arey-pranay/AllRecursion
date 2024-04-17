import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    calc(log2(n), n,0);
  }
  public static void calc(int power, int num, int x){
    if(power==-1){
      System.out.println(x);
      return;
    } 
    int p = (int)Math.pow(2, power);
    if(num<p){
      x*=10;
      x+=0;
    } 
    else{
      x*=10;
      x+=1;
    }
    calc(power-1, num % p,x);
    return;
  }
  public static int log2(int N)
  {
      int result = (int)(Math.log(N) / Math.log(2));
      return result;
  }
}
