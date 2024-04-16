import java.util.ArrayList;
import java.util.Scanner;
public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    int n = sc.nextInt();
    int i=0;
    while(i<n){
      arr.add(sc.nextInt());
      i++;
    }
    System.out.println(mean(0, 0, arr));
  }
  public static float mean(float curr, int i, ArrayList<Integer> arr){
    if(i==arr.size()){
      return curr;
    } 
    curr = ((i*curr) + arr.get(i))/(i+1);
    return mean(curr,i+1,arr);
  }
}
public static int calcSum(int sum, int i, ArrayList<Integer> arr){
  if(i==arr.size()) return sum;
  sum+= arr.get(i)+calcSum(sum, i+1, arr);
  return sum;
}