import java.util.Scanner;
public class GCD
{
  Scanner sc = new Scanner(System.in);
   int n;
   int a[];
  void Input()
  {
    System.out.println("Enter the number of Elements");
    n = sc.nextInt();
    a = new int[n];
    System.out.println("Enter Elements");
    for(int i=0; i<n; i++)
    {
     a[i]=sc.nextInt();
    }
  }
  int gcd(int a, int b)
  {
    if (a == 0)
    return b;
    return gcd(b % a, a);
    
  }
  int Calculate(int a[], int n)
  {
    int result = 0;
    for (int element: a){
        result = gcd(result, element);

        if(result == 1)
        {
           return 1;
        }
    }

    return result;
  }
  void Display()
  {
    System.out.println(Calculate(a,n));
  }
  public static void main(String args[])
  {
    GCD G = new GCD();
    G.Input();
    G.Display();
  }
    
}
