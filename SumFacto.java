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
    for(double i=1; i<=7.0; i++)
   {
     double num = fact(i);
     sum = sum + ((double)i/num);
   }
   
   System.out.print("Sum of the Factorial: "+ sum);
}
}