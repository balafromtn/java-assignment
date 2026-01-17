//16.Program to sum 1/1! + 2/2! + 3/3! + …. + 7/7! using methods

//import java.util.Scanner;

class SumFacto
{
  static double fact(double n)
  {
    if(n==0)
        return 1;
    return (n*fact(n-1));

  }
  public static void main(String args[])
  { double sum = 0;
    //Scanner scan = new Scanner(System.in);
    System.out.print("\n=========== Program to sum 1/1! + 2/2! + ... + 7/7! ===========\n");
    //System.out.print("\nEnter the Number Range: ");
    //double range = scan.nextDouble();
    for(double i=1; i<=7.0; i++)
   {
     double num = fact(i);
     sum = sum + ((double)i/num);
   }
   
   System.out.printf("\nSum of the Factorial: %.2f\n", sum);
}
}