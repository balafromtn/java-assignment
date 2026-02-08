//19. Program to find the length of string, concatenation, substring, reverse  and character replacement without using library function using a menu.

import java.util.*;

class StringOps
{
 public static String reverse(String str)
 {
  String reversed = "";
  char arr[] = str.toCharArray();
  for(int i=str.length()-1; i>=0; i--)
  {
   reversed += arr[i];
  }
  return reversed;
 }
 public static void main(String args[])
 {
  System.out.println(reverse("hello"));
 }
}