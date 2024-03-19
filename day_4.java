import java.io.*;
import java.util.*;
public class day_4
{
   public static void main(String args[ ])
       {
         System.out.println("Enter Number to check that the Number is Positive or Negative");
         Scanner s=new Scanner(System.in);
         int i=s.nextInt( );
         if(i>0)
          {
             System.out.println(" "+ i +" is Positive Number");
          }
         else if(i<0)
           {
             System.out.println(" "+ i +" is Negative Number");
           }
        else 
             {
                System.out.println(" "+ i +" is Neighter Positive Nor Negative");
             }
         
       }
}