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


import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Charsets
{
  public static void main(final String[] args)
  {
    // Prints details of all character encodings available on a system

    System.out.println("DEFAULT CHARSET\n");
    printCharsetDetails(Charset.defaultCharset());

    System.out.println("ALL SUPPORTED CHARSETS\n");
    final SortedMap<String, Charset> availableCharsets = Charset
      .availableCharsets();
    for (final Charset charset: availableCharsets.values())
    {
      printCharsetDetails(charset);
    }
  }

  private static void printCharsetDetails(final Charset charset)
  {
    String displayName = charset.name();
    final SortedSet<String> aliases = new TreeSet<String>(charset.aliases());
    final float maxBytesPerChar;
    if (charset.canEncode())
    {
      final CharsetEncoder encoder = charset.newEncoder();
      maxBytesPerChar = encoder.maxBytesPerChar();
    }
    else
    {
      maxBytesPerChar = 0;
    }

    System.out
      .println(String.format("charset: %s%naliases: %s%nmax %d bytes%n",
                             displayName,
                             String.join(", ", aliases),
                             (int) maxBytesPerChar));
  }

}
