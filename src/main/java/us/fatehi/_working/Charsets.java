/*

Unicode Learning
https://github.com/sualeh/unicode-learning
Copyright (c) 2016, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but 
WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 

This work is licensed under the Creative Commons Attribution-ShareAlike 
4.0 International License. To view a copy of this license, visit 
http://creativecommons.org/licenses/by-sa/4.0/. 

*/
package us.fatehi._working;


import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Charsets
{
  public static void main(final String[] args)
  {
    printCharsetDetails(Charset.defaultCharset());
    System.out.println();

    final SortedMap<String, Charset> availableCharsets = Charset
        .availableCharsets();
    for (final Charset charset: availableCharsets.values())
    {
      printCharsetDetails(charset);
    }
  }

  private static void printCharsetDetails(final Charset charset)
  {
    final SortedSet<String> aliases = new TreeSet<String>(charset.aliases());
    aliases.add(charset.name());
    final float averageBytesPerChar;
    final float maxBytesPerChar;
    if (charset.canEncode())
    {
      final CharsetEncoder encoder = charset.newEncoder();
      averageBytesPerChar = encoder.averageBytesPerChar();
      maxBytesPerChar = encoder.maxBytesPerChar();
    }
    else
    {
      averageBytesPerChar = 0;
      maxBytesPerChar = 0;
    }

    System.out.println(String
                       .format("%s max %d bytes, %s length",
                               aliases,
                               (int) maxBytesPerChar,
                               averageBytesPerChar != maxBytesPerChar? "variable": "fixed"));
  }

}
