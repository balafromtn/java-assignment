//7. Program to check whether the given number is Armstrong number or not 

import java.util.Scanner;

class Amstrong
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("\n============= Program to Check the Armstrong Number =============\n");
  System.out.println("Enter the Number: ");
  int num = scan.nextInt();
  int numLength = (String.valueOf(num)).length(); 
  double sum = 0.0;
  int arm = num;

  while(num>0)
  {
   int rem = num%10;
   sum = sum + Math.pow(rem,numLength);
   num = num/10;
  }

  if (arm == sum) {
      System.out.println("\n"+arm + " is an Armstrong number.");
  } else {
      System.out.println("\n"+arm + " is not an Armstrong number.");
  }
 }
}