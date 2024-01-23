/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2024, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

*/
package us.fatehi.whatacharacter;


public class UnicodeCharLiterals
{

  public static void main(String[] args)
  {
    // Demonstrates how to use Unicode characters in string and character literals
    // The hexadecimal values can be in uppercase or lowercase
    // The characters are always in the Basic Multilingual Plane

    // ----------------------------------------
    // Character literals

    char ch1 = 'a';
    char ch2 = '東'; // (Not an ASCII character!)
    // char ch3 = '𐐀'; // (Not a BMP character!)
    // char ch4 = '\'; // (Backslash is a syntax error!)

    System.out.printf("%s %s%n", ch1, ch2);

    // ----------------------------------------
    // Unicode notation
    // \\uHHHH
    // where H is a case-insensitive hexadecimal character

    char ch5 = '\u00EA'; // ‘ê’
    String str1 = "a\u00ea\u00f1\u00fcc"; // “aêñüc”
    String str2 = "A\u00EA\u00F1\u00FCC"; // “AêñüC”

    System.out.printf("%s%n%s%n%s%n", ch5, str1, str2);

    // ----------------------------------------
  }

}
