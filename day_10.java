import java.io.*;
import java.util.*;
public class day_10
{
    public static void main(String args[])
     {
          int  num , i ,fact=1;
          System.out.println("Enter number for calculating it's factorior");
          Scanner s=new Scanner(System.in);
          num=s.nextInt();
          for(i=1;i<=num;i++)
             {
               fact=fact*i;
             }
       System.out.println("Factorior of " + num + " is  :"+fact);   
     }
}