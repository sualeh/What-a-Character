/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2023, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

*/
package us.fatehi.whatacharacter;


public class Substring
{

  public static void main(String[] args)
  {

    // Some of the Java APIs are not aware of Unicode characters outside
    // of the Basic Multilingual Plane.
    // A character outside of the Basic Multilingual Plane is
    // represented by a surrogate pair.

    final int cp = 0x010400; // 'DESERET CAPITAL LETTER LONG I' 𐐀
    final String cpchar = new StringBuffer()
      .appendCodePoint(cp)
      .toString();

    System.out.printf(
      "character: %s - code point: %d - '%s' in Unicode block '%s'; character count: %d%n",
      cpchar,
      cp,
      Character.getName(cp),
      Character.UnicodeBlock.of(cp),
      Character.charCount(cp));
    final char[] surrogatePair = Character.toChars(cp);
    System.out.printf("surrogate pair: U+%02x + U+%02x%n",
                      (int) surrogatePair[0],
                      (int) surrogatePair[1]);

    // String gives the length including surrogate characters, NOT the
    // number of Unicode characters
    System.out.println(cpchar);
    System.out.println("length: " + cpchar.length());
    System.out.println(
      "code point count: " + cpchar.codePointCount(0, cpchar.length()));

    // Using a StringBuffer to delete characters can cause problems,
    // since it is not aware of Supplementary Plane characters
    final String textDeleted = cpchar.substring(0, 1) + 'j';
    System.out.println(textDeleted);
    System.out.println("length: " + textDeleted.length());
    System.out.println("code point: " + textDeleted.codePointAt(0));
  }

}
