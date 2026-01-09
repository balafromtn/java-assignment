//Program to print the largest of the three numbers

import java.util.Scanner;

class MaxOfThree
{
 public static void main(String args[])
 {
  System.out.println("==================== Program to Find Max of Three Numbers ====================\n");
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the 1st Number: ");
  int a = scan.nextInt();
  System.out.println("Enter the 2nd Number: ");
  int b = scan.nextInt();
  System.out.println("Enter the 3rd Number: ");
  int c = scan.nextInt();
  int max;
  if(a>b && a>c)
   max = a;
  else if(b>c && b>a)
   max = b;
  else
   max = c;
  System.out.println("The largest Number is "+max);
 }
}