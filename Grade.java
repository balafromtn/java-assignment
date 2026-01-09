//18. Program to find grade for the given mark using switch case

import java.util.Scanner;

class Grade
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("\n========== Program to Find Grade ==========");
  System.out.println("\nEnter Your Mark: ");
  int mark = scan.nextInt();
  String grade;
  mark  = mark /10;

  switch(mark){
  case 10:
  case 9:
   grade = "A";
   break;
  case 8:
   grade = "B";
   break;
  case 7:
   grade = "C";
   break;
  case 6:
   grade = "D";
   break;
  default:
   grade = "F";
   break;
  }
  System.out.println("\nYour Grade is " +grade);
 }
}