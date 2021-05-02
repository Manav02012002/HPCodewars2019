import java.util.Scanner;
public class ReverseDifference
 {
    Scanner sc = new Scanner(System.in);
    int n,n1,rn;
    void Input()
    {
    System.out.println("Enter a number:");
    n = sc.nextInt();
    n1=n;
    }
    void Manipulate()
    {
        rn =0;
        while(n1 != 0) 
        {
    
            int digit = n1 % 10;
            rn = rn * 10 + digit;
            n1 /= 10;
        }
    }
    void Display()
    {
     System.out.println("The difference between the number and it's reverse is: "+ (n-rn));
    }
    public static void main(String args[])
    {
    ReverseDifference A = new ReverseDifference();
    A.Input();
    A.Manipulate();
    A.Display();

    }
    
}
