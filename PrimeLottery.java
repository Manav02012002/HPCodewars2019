import java.util.Scanner;
public class PrimeLottery
{
 Scanner sc = new Scanner(System.in);
 int n;
 int a[];
 void Accept()
 {
    System.out.println("Enter n, an odd number");
    n = sc.nextInt();
    a = new int[n];
    System.out.println("Enter the numbers");
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    }
 }
 void Calculate()
 {
     int c;
     c=0;
    for (int i = 0; i < a.length - 1; i++)  
    {  
        int index = i;  
        for (int j = i + 1; j < a.length; j++){  
            if (a[j] < a[index])
            {  
                index = j;
            }  
        }  
        int smallerNumber = a[index];   
        a[index] = a[i];  
        a[i] = smallerNumber;  
    }  
    int mid;
    mid = (n-1)/2;
    for(int i=1;i<=a[mid];i++)
    {
    
     if(a[mid]%i==0)
     {
      c++;
     }
    }
     if(c==2)
     {
     System.out.println("Won");
     }
     else
     {
        System.out.println("Better luck next time");
     }

    }



 public static void main(String args[])
 {
  PrimeLottery P = new PrimeLottery();
  P.Accept();
  P.Calculate();
 }
    
}
