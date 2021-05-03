import java.util.Scanner;
public class HigherPowers
{
 Scanner sc = new Scanner(System.in);
 int N,K;
 void Accept()
 {
  System.out.println("Enter N");
  N = sc.nextInt();
  System.out.println("Enter K");
  K = sc.nextInt();
 }
 void Calculate()
 {
  while(N>K)
  {
    N=N/K;
  }
  if(N<K)
  {
    System.out.println("No");
  }
  else{
    System.out.println("Yes");
  }
 }
 public static void main(String args[])
 {
  HigherPowers H = new HigherPowers();
  H.Accept();
  H.Calculate();

 }
    
}
