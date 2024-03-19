import java.io.*;
import java.util.*;
public class ECC
{
    public static void main(String args[])
    {
    int G ,  Na , Nb , Pa , Pb , Ka , Kb;
  Scanner sc =new Scanner(System.in);
   System.out.println("Enter the Global public key for both users");
   G = sc.nextInt();
   System.out.println("Enter the private key for user A");
   Na =sc.nextInt();
  System.out.println("Enter the private key for user B");
  Nb =sc.nextInt();
   Pa=Na*G;
   Pb=Nb*G;
  Ka=Pb*Na;
  Kb=Pa*Nb;
  System.out.println("Secrete key of User A is " +Ka);
  System.out.println("Secrete key of User B is " +Kb); 
  }
}