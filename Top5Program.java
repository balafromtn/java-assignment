//Program to Display the Top 5 Programs with the Menu

import java.util.Scanner;

class Top5Program
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
   int option;

   do{System.out.println("\n======== Menu ========\n");
   System.out.println("\nEnter 1 to Check Prime Number\nEnter 2 to Check Fibonacci\nEnter 3 to Sum of Elements in Square Matrix\nEnter 4 to Occurance in Array\nEnter 5 to Check Sum of Digits in a Number\nEnter 0 to Exit\n");
   
   System.out.print("\nEnter the Option: ");
   option = scan.nextInt();

   switch(option){

   case 1:   
   PrimeCheck.main(null);
   break;
   
   case 2:
   Fibonacci.main(null);
   break;

   case 3:
   SumMatrix.main(null);
   break;

   case 4:
   OccurArr.main(null);
   break;

   case 5:
   SumDigit.main(null);
   break;
   
   case 0:
   System.out.println("Exiting...");
   break;
   
   default:
   System.out.print("Invalid Option!");
   }}while(option !=0);
  }
}