/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2020, Sualeh Fatehi.

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

  public static void main(String[] args)
  {
    // How to use Unicode characters in string and character literals
    // The hexadecimal values can be in uppercase or lowercase
    // The characters are always in the Basic Multilingual Plane

    char char1 = 'a';
    System.out.println(char1);

    char char2 = '\u00EA';
    System.out.println(char2);

    char char3 = '\\';
    System.out.println(char3);

    String original1 = "a\u00ea\u00f1\u00fcc";
    System.out.println(original1);

    String original2 = "A\u00EA\u00F1\u00FCC";
    System.out.println(original2);

    String original3 = "\\";
    System.out.println(original3);

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

  private static void printUnicode(char ch)
  {
    System.out.println(toUnicode(ch));
  }

  private static String toUnicode(char ch)
  {
    return String.format("\\u%04x", (int) ch);
  }

}
