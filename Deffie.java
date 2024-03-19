class Deffie
{
    private static long power (long Xa ,long Xb ,long p)
      {
        if(Xb==1)
            return Xa;
          else 
             return (((long)Math.pow(Xa,Xb)) %p);
      }
public static void main(String[] args)
  {
      long p, alpha, x, Xa, y, Xb, Ka, Kb;
       p = 353;
       System.out.println("The value of P:" + p);
       alpha = 3;
       System.out.println("The value of alpha:" + alpha); 
       Xa=97;
       System.out.println("Private key for user 1:" + Xa);
       x= power(alpha, Xa, p);
       Xb=233;
       System.out.println("Private key for user 2:" + Xb);
       y= power(alpha, Xb, p);
       Ka = power(y, Xa, p);
       Kb = power(x, Xb, p);
       System.out.println("Secret key for user 1:" + Ka);
       System.out.println("Secret key for user 2:" + Kb);
  }
}