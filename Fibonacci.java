//8. Program to print Fibonacci series upto given Number

import java.util.Scanner;
class Fibonacci
{
 public static void main(String args[])
 {
  int num1 = 0, num2 = 1, num3;
  Scanner scan = new Scanner(System.in);
  System.out.println("\n========== Fibonacci series ==========\n");
  System.out.print("Enter the Number of Range: ");
  int count = scan.nextInt();
  System.out.print("\n"+num1+" "+num2);
  for(int i=3; i<=count; i++)
  {
  num3 = num1 + num2;
  System.out.print(" "+num3);
  num1 = num2;
  num2 = num3; 
  }
 }
}