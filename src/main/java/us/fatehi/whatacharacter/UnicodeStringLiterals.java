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


public class UnicodeStringLiterals
{

  private static void printUnicode(char ch) {
    System.out.println(toUnicode(ch));
  }

  private static String toUnicode(char ch) {
    return String.format("\\u%04x", (int) ch);
  }

  public static void main(String[] args)
  {
    // How to use Unicode characters in string and character literals
    // The hexadecimal values can be in uppercase or lowercase
    // The characters are always in the Basic Multilingual Plane


    // 'DESERET CAPITAL LETTER LONG I' - 𐐀

    String cp1 = Character.toString(0x010400);      
    System.out.println(cp1);
    System.out.println(cp1.length());    
    System.out.println(cp1.codePointCount(0, cp1.length()));

    // Character escape sequences

    printUnicode('\t');
    printUnicode('\b');
    printUnicode('\n');
    printUnicode('\r');
    printUnicode('\f');
    printUnicode('\'');
    printUnicode('\"');
    printUnicode('\\');
  }

}
