import java.util.Scanner;
public class LastManStanding 
{
   Scanner sc = new Scanner(System.in);
   int n;
    void Accept()
    { 
     System.out.println("Enter n");
     n = sc.nextInt();   
    }
    int Calculate(int n)
    {
     if (n == 1)
     {
      return 1;
     }
      else
      {
       return (Calculate(n - 1) + 1) % n + 1;
      }
    }

    void Display()
    {
        System.out.println("The chosen place is " + Calculate(n));
    }
    public static void main(String args[])
    {
     LastManStanding L = new LastManStanding();
     L.Accept();
     L.Display();


    }
}
