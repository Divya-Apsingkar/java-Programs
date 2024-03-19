import java.io.*;
import java.util.*;
public class day_9
{
public static void main(String args[])
  {
    int a , count=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter The Number to find out number of digits of Integers");
    a=s.nextInt();
   while(a !=0)
      {
         a=a/10;
         ++count;
      }
    System.out.println("Number of digits: " + count);
  }
}