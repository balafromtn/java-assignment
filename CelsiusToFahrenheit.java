//3. Program to convert temperature in Celsius to Fahrenheit

import java.util.Scanner;

class CelsiusToFahrenheit
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  double Celsius = scan.nextDouble();
  double Fahrenheit = (Celsius*(9/5.0))+32;
  System.out.println(Celsius+" °C is Equals to "+Fahrenheit+" °F");
 }
}