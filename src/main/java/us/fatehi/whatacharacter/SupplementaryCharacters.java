/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2019, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

*/
package us.fatehi.whatacharacter;


public class SupplementaryCharacters
{

  public static void main(final String[] args)
    throws Exception
  {
    // Some of the Java APIs are not aware of Unicode characters outside
    // of the Basic Multilingual Plane.

    // A character outside of the Basic Multilingual Plane is
    // represented by a surrogate pair.
    final int cp = 0x01D4AE;
    System.out.println(String.format(
      "character: %s - code point: %d - %s in %s; character count: %d",
      new StringBuffer().appendCodePoint(cp),
      cp,
      Character.getName(cp),
      Character.UnicodeBlock.of(cp),
      Character.charCount(cp)));

    // String gives the length including surrogate characters, NOT the
    // number of Unicode characters
    final String text = "text" + new StringBuffer().appendCodePoint(cp);
    System.out.println("length: " + text.length());

    // Using a StringBuffer to delete characters can cause problems,
    // since it is not aware of Supplementary Plane characters
    final String textDeleted = new StringBuffer(text)
      .deleteCharAt(4)
      .toString();
    System.out.println(textDeleted);
  }

}
