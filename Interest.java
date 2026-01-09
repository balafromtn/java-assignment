//Program to find Simple Interest for given principal amount, time and rate

import java.util.Scanner;

class Interest
{
 public static void main(String args[])
 {
  Scanner scanner = new Scanner(System.in);
  double interest, priAmt, time, rate;
  
  System.out.println("Enter the Principal Amount: ");
  priAmt = scanner.nextDouble();
  
  System.out.println("Enter the Time (In Years): ");
  time = scanner.nextDouble();

  System.out.println("Enter the Rate: ");
  rate = scanner.nextDouble();

  interest = (priAmt*time*rate)/100;

  System.out.println("Simple Interest is "+ interest);
  //Scanner.close();
 }
}