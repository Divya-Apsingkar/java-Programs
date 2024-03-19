import java.io.*;
import java.util.*;
public class day_7
{
	public static void main(String[] args)
	{
		int Year, Month;
           System.out.println("Enter Month And Year to find out the days of Month in the Year");
		Scanner sc = new Scanner(System.in);
		Month = sc.nextInt();
		Year = sc.nextInt();
		if(Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12)
               {
			System.out.print("Number of days is 31");
               }
		else if((Month == 2) && ((Year%400==0) || (Year%4==0 && Year%100!=0)))
		{
			System.out.print("Number of days is 29");
		}
		else if(Month == 2)
		{
			System.out.print("Number of days is 28");
		}
		else
			System.out.println("Number of days is 30");
	}
}