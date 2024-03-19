import java.io.*;
import java.util.*;
public class day_5
{
    public static void main(String args[])
          {
            System.out.println("Enter Number check that the Number is Even or odd");
            Scanner s=new Scanner(System.in);
            int n =s.nextInt();
            if(n%2==0)
             {
             System.out.println(" " + n + " is Even Number");
             }
            else
             {
              System.out.println(" " + n + " is Odd Number");
             }
          }
}