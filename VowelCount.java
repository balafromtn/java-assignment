//20. Program to count the number of vowels, consonants and numbers in a given string

import java.util.*;

class VowelCount
{

 public static void main(String args[])
 {
  int vowelCount = 0, consCount = 0, NumCount = 0;
  System.out.println("\n===== Program to Find the Count of Given Input Text =====\n");
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter the Word: ");
  String input = scan.nextLine();
  String word = input.toLowerCase();

  for(int i=0; i<word.length(); i++)
  {
   char letter = word.charAt(i);

   if(letter>='a' && letter<= 'z')
   {
    if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
    {
    vowelCount++;
    }
    else
    {
    consCount++;
    }
   }
   if(letter >= '0' && letter <= '9')
   {
    NumCount++;
   }
  }
  System.out.printf("\n\nInput Text = %s\nVowels = %d\nConsonants = %d\nNumbers = %d\n", input,vowelCount,consCount,NumCount);
 }
}