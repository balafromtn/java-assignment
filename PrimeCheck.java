//6. Program to check whether the given number is prime number or not

import java.util.Scanner;

class PrimeCheck
{    
public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  
  System.out.println("========= Program to Check Prime Number =========\n");
  System.out.print("Enter the number: ");
  int num = scan.nextInt();

  int flag = 1;
  if(num<=1)
  {
    flag = 0;
  }
  else
  {
    for(int i = 2; i<num; i++)
    {
        if (num%i==0) 
        {
            flag = 0;
            System.out.println(i);
            break;
        }
    }
  }

  if (flag==0) 
    {
        System.out.println("\n"+num+" is not a Prime Number\n");
    }
    else
    {
        System.out.println("\n"+num+" is a Prime Number\n");
    }
}
}