import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      arr.add(sc.nextInt());
    }
    int sum =0;
    System.out.println(calc(arr, sum, 0));
  }
  public static int calc(ArrayList<Integer> arr, int sum, int i){
    if(i==arr.size()) return sum;
    sum+=arr.get(i);
    return calc(arr,sum,++i);
  }
}
