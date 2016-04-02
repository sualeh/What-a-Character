/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

*/
package us.fatehi.whatacharacter;


import java.util.Arrays;

public class UTF16StringLength
{

  public static void main(final String[] args)
    throws Exception
  {
    final int cp = 0x10400;
    System.out.println("code point: " + cp);
    System.out.println("code point count: " + Character.charCount(cp));

    final String text = "text" + new StringBuffer().appendCodePoint(cp);
    System.out.println("length: " + text.length());
    System.out.println(Arrays.toString(text.toCharArray()));

    for (int i = 0; i < text.length(); i++)
    {
      final int codePointAt = text.codePointAt(i);
      System.out.println(codePointAt);
    }

  }

}
