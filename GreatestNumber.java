# GreatestNumber
import java.io.*;
import java.util.*;
public class GreatestNumber
{ 
  public static void main(String args[])
  {
   int a,b,c,largest;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any three numbers:");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   if(a>=b && a>=c)
   {
     System.out.println("Largest Number:"+a);
     }
   if(b>=a && b>=c)
   {
     System.out.println("Largest Number:"+b);
     }
   if(c>=a && c>=b)
   {
     System.out.println("Largest Number:"+c);
     }
    }
   } 
