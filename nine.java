import java.io.*;
import java.util.*;
public class nine
{
   public static void main(String args[ ])
      {
      System.out.println("I am Main method & i m going to execute ten method");
      ten t=new ten( );
      System.out.println(t.a);
      t.method( );
      }
}
class ten
{
   int a=500;
   void method( )
  {
    System.out.println(a);
  }
}