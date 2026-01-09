//Program for converting kilometers to miles
import java.util.Scanner;

class KmToMiles
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("========= Program to convert Km to Mile =========\n");
  System.out.println("Enter the Kilometer: ");
  double kilometer = scan.nextDouble();
  double mile = kilometer * 0.621371;
  System.out.println(kilometer+" Kilometer is Equals to "+mile+" Mile");
 }
}