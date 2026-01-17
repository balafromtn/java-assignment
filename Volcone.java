//Program to find Volume of a Cone for given radius and height

import java.util.Scanner;

class Volcone
{
 public static void main(String args[])
 {
  System.out.println("==================== Program to Find Volume of a Cone ====================\n");
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the Radius: ");
  double rad = scan.nextDouble();
  System.out.println("Enter the Height: ");
  double hei = scan.nextDouble();
  double vol = (1/3.0)*3.14*rad*rad*hei;
  System.out.printf("Volume of the Cone: %.2f%n", vol);
 }
} 