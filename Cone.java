import java.util.*;

class Cone
{
 public static void main(String args[])
 {
  Scanner inp = new Scanner(System.in);
  System.out.print("\n====== Program to Find the Volume of Cone ======\n");
  System.out.print("\nEnter the Radius: ");
  double r = inp.nextDouble();
  System.out.print("\nEnter the Height: ");
  double h = inp.nextDouble();
  double volume = (1.0/3.0)*3.14*r*r*h;
  System.out.printf("\nVolume = %.2f\n", volume);
 }
}