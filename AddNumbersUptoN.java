//10. Program to add numbers upto n

import java.util.Scanner;

class AddNumbersUptoN
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  
  System.out.println("============== Program to Add Numbers 1 to Given Number ==============\n");
  
  System.out.println("Enter the Number: ");
  int num = scan.nextInt();
  int tot=0;
  for(int i=0; i<=num; i++)
  {
   tot += i;
  }
  System.out.println("\nThe Total of 1 to "+num+ " is "+ tot);
 }
}