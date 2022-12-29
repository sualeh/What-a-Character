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


import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Prints details of all charsets (technically, encoding schemes) supported on
 * the currently running language runtime. The details are printed in JSON, so the output can
 * be imported somewhere else.
 */
public class AvailableEncodings
{

  public static void main(final String[] args)
  {

    // Prints details of all character encodings available on a system

    System.out.printf("DEFAULT CHARSET: %s%n%n",
                      Charset
                        .defaultCharset()
                        .name());

    System.out.println("ALL SUPPORTED CHARSETS\n");
    final SortedMap<String, Charset> availableCharsets =
      Charset.availableCharsets();
    final List<CharsetDetails> charsetDetails = new ArrayList<>();
    for (final Charset charset : availableCharsets.values())
    {
      charsetDetails.add(new CharsetDetails(charset));
    }

    final Gson gson = new GsonBuilder()
      .setPrettyPrinting()
      .create();
    System.out.println(gson.toJson(charsetDetails));
  }

  private static class CharsetDetails
  {

    private final String charset;
    private final SortedSet<String> aliases;
    private final float maxBytesPerChar;

    CharsetDetails(final Charset charset)
    {
      this.charset = charset.name();
      aliases = new TreeSet<>(charset.aliases());
      if (charset.canEncode())
      {
        final CharsetEncoder encoder = charset.newEncoder();
        maxBytesPerChar = encoder.maxBytesPerChar();
      }
      else
      {
        maxBytesPerChar = 0;
      }
    }

    public String getCharset()
    {
      return charset;
    }

    public SortedSet<String> getAliases()
    {
      return aliases;
    }

    public float getMaxBytesPerChar()
    {
      return maxBytesPerChar;
    }

  }

}
