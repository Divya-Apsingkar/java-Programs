import java.io.*;
import java.util.*;
public class Eliptic_Curve
{
 public static void main(String args[])
{
   int G,Ua,Ub,Pa,Pb,Ka,Kb;
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the Global Public key for both Users");
   G = sc.nextInt();
   System.out.println("Enter the Private Key for Users A");
   Ua = sc.nextInt();
   System.out.println("Enter the Private key for User B");
   Ub = sc.nextInt();
   Pa = Ua*G;
   Pb = Ub*G;
   Ka = Pb*Ua;
   Kb = Pa*Ub;
   System.out.println("Secrete Key Shared for User A is :"+Ka);
   System.out.println("Secrete Key Shared for User B is :"+Kb);
}
}