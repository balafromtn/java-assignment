//11. Program to find the sum of squares of even numbers upto n

import java.util.Scanner;

class SqUptoN
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("\n=========== Program to Find the Sum of Squares of Even Numbers ===========");
  System.out.println("\nEnter the Number: ");
  int num = scan.nextInt();
  int tot=0;
  for(int i = 2; i<=num; i++)
  {
   if(i%2==0)
   {
    tot+=(i*i);
   }
  }
  System.out.println("\nSum of Squares upto "+num+" is "+tot);
 }
}