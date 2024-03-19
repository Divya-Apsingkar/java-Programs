import java.io.*;
import java.util.*;
public class day_8
{
 public static void main(String[] args) 
{
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the values for a, b and c: ");
           a = sc.nextDouble();
           b = sc.nextDouble();
           c = sc.nextDouble();
           double d = Math.pow(b,2) - 4*a*c;
 if(d > 0)
   {
        System.out.println("There are two real roots");
        System.out.println("Roots are " + (-b+Math.sqrt(d))/(2*a) + " and " + (-b-Math.sqrt(d))/(2*a));
   }
 else if (d == 0)
  {
       System.out.println("Roots are equal");
       System.out.println("Roots are " + -b/(2*a));
  }
 else
 {
     System.out.println("No real roots");
     System.out.println("Roots are " + -b/(2*a) + "+i" + Math.sqrt(-d)/(2*a) + " and "+ -b/(2*a) + "-i" + Math.sqrt(-d)/(2*a));
 }
}
}
