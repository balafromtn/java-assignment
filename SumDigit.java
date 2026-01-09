//9. Program to find Sum of the digits


import java.util.Scanner;
class SumDigit
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  System.out.print("\n============ Program to find Sum of the digits ============\n");
  System.out.print("\nEnter the Number: ");
  int input = scan.nextInt();
  int num = input;
  int sum = 0;
  while(num>0)
  {
   int digit = num%10;
   sum = sum + digit;
   num = num/10;
  }
  System.out.println("\nSum of the digits of "+input+" is "+ sum);
 }
}