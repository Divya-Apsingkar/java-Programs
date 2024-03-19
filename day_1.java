import java.io.*;
import java.util.*;
public class day_1
{
     public static void main(String args[])
      {
        System.out.println("Type Character to check that an Character is Consonant or Vowel");
       
	    Scanner sc=new Scanner(System.in);
	   char c=sc.next( ).charAt(0);	 		
	       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	           {
	              System.out.println("Entered character "+c+" is  Vowel"); 
	           }
	            else if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
                     {
		              System.out.println("Entered character "+c+" is Consonant");
                     }
	                   else
		                  System.out.println("Invalid Output");		
     }
}
  