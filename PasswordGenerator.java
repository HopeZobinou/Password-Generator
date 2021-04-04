/**
 * Password Generator
 *
 * This program generates a with random letters, numbers, and symbols 
 * 
 * Creator: Hope Zobinou
 * 
 * Date: 4/3/21
 */
import java.util.*;
import java.io.*;
import java.util.Scanner;
public class PasswordGenerator
{
    public static void main(String [] args)
    {
         int UserLength = 0; 
         Scanner kb = new Scanner(System.in); //Keyboard object to get the users input
         System.out.println("What length do you want the password to be:");
         UserLength = kb.nextInt(); //The users length
         System.out.println();
         System.out.println(generatePassword(UserLength)); //Calls the generatePassword method and prints the password
    }
    public static char[] generatePassword(int Length)
    {
         System.out.println("Your Password: ");
         String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String LowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
         String Numbers = "0123456789";
         String PassSymbols = "!@#$%^&*_=+-/.?<>~";
         String Values = CapitalLetters + LowerCaseLetters + Numbers + PassSymbols; //String that stores all the characters
         Random ran = new Random(); //Object for random
         char [] password = new char[Length]; //Char object with the length of the users length
         for(int i = 0; i < Length; i ++)
         {
               password[i] = Values.charAt(ran.nextInt(Values.length())); //As the for loop continues it stores a random character from value
         }
         return password; //Returns the final password       
    }

}    