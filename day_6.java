import java.io.*;
import java.util.*;
public class day_6
{
    public static void main(String args[ ])
      {
        
        System.out.println("Enter co-ordinates to Find out the Quadrant in which co-ordinates lie");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        if(x>0 && y>0)
           {
            System.out.println("Quadrant I");   
           }
        else if(x<0 && y>0)
             {
              System.out.println("Quadrant II");
             }     
        else if(x<0 && y<0) 
               {
                System.out.println("Quadrant III"); 
               }
        else if (x > 0 && y < 0)
                 {
                  System.out.println("Quadrant IV");
                 }
        
        else if (x == 0 && y == 0)
                   {
                     System.out.println("Origin");
                   }
        else if (y==0 && x!=0)
                    {
                      System.out.println("x-axis");
                    }
        else if (x==0 && y!=0)
                     {
                       System.out.println("y-axis");
                     }


     }
}