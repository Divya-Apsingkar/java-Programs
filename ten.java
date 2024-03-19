import java.io.*;
import java.util.*;
public class ten
{
    public static void main(String args[ ])
          {
             two t=new two( );
              t.reverseno( );
          }
}
class two
{
    void reverseno( )
      {
         int reminder,number;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter number to reverse");
         number=s.nextInt( );
       while(number>0)
           {
              reminder=number%10;
              System.out.print(reminder);
              number=number/10;

           }
      }
}