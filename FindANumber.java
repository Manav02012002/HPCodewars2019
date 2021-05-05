import java.util.Scanner;
public class FindANumber
{
 Scanner sc = new Scanner(System.in);
 int LCM, HCF, n1, n2;
 void Accept()
 {
  System.out.println("Enter HCF, LCM and one number respectively");
  HCF = sc.nextInt();
  LCM = sc.nextInt();
  n1 = sc.nextInt();

 }
 void Calculate()
 {
  n2 = HCF*LCM/n1;
  System.out.println(n2);
 }
 public static void main(String args[])
 {
  FindANumber F = new FindANumber();
  F.Accept();
  F.Calculate();

 }
    
}
