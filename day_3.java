import java.io.*;
import java.util.*;
public class day_3
{
  public static void main(String args[ ])
   {
     System.out.println("Enter Character to Check it's ASCII value");
       Scanner sc=new Scanner(System.in);
             char c=sc.next().charAt(0);
              Formatter formatSpecifier = new Formatter();
                 formatSpecifier.format("%d", (int)c);
                  System.out.println( "The ASCII value of the character ' "+ c+ " ' is " + formatSpecifier);
   }
}