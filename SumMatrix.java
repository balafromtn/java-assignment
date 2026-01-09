//13. Program to sum of elements in diagonal of a square matrix.

import java.util.Scanner;

class SumMatrix
{
 public static void main(String args[])
 {
  System.out.println("\n======== Program to sum of elements in diagonal of a square matrix ========\n");
  Scanner scan = new Scanner(System.in);
  System.out.print("\nEnter the Size of Matrix: ");
  int size = scan.nextInt();
  int matrix[][] = new int[size][size];
  int sum = 0;
  int rows = matrix.length;
  int cols = matrix[0].length;
  System.out.println("\nEnter the Elements of the matrix: ");
  
  for(int i=0; i<rows; i++)
    for(int j=0; j<cols; j++)
  {
   System.out.printf("Enter the Element at [%d,%d]: ",i,j);
   matrix[i][j] = scan.nextInt();
   if(i==j)
   {
    sum+=matrix[i][j];
   }
  }
  System.out.println("\nMatrix is: ");
  for(int i=0; i<rows; i++)
  {
    for(int j=0; j<cols; j++)
    {
     System.out.print(matrix[i][j]+" ");
    }
  System.out.print("\n");
  }
  System.out.print("\nSum of Elements in Diagonal of the Square Matrix: " + (sum));
 }
}