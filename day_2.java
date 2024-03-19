import java.io.*;
import java.util.*;
public class day_2
{
   public static void main(String args[ ])
          {
             System.out.println("Enter input to check that given input is character or not");
             Scanner sc=new Scanner(System.in);
             char c=sc.next().charAt(0);
              if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
               {
                 System.out.println(c + " is Alphabet" );
               }
             else 
               {
                 System.out.println(c + " is not an Alphabet" );
               }
        
          }
}