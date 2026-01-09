//12. Program to find number of occurrences of a number in an array.


import java.util.Scanner;
class OccurArr
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
   System.out.println("\n======= Program to Find Occurrences of Number =======\n");
   System.out.print("Enter the size of Array [1 to 10]: ");
   int size = scan.nextInt();
   int arr[] = new int[10];

   for(int i=0; i<size; i++)
   {
      System.out.printf("Enter Element (%d): ",(i+1));
      arr[i] = scan.nextInt();
   }

   System.out.print("\nEnter the value to Find: ");
   int find = scan.nextInt();
   int count = 0;
   for(int i:arr)
   {
    if(find == i)
       count++;
   }
   if(count==0)
   {
     System.out.print(find + " is Not Found!\n");
   }
   else
   {
     System.out.print("\n" + find + " Occurred " + count +" times.\n");
   }

  }
}