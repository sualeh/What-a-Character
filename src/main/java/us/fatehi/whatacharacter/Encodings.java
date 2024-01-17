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


import static java.nio.charset.StandardCharsets.UTF_16BE;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.nio.charset.Charset;

public class Encodings
{

  public static void main(String[] args)
  {
    final String text = "Aß東𐐀";

    printCodePoints(text);
    System.out.println();

    System.out.println("UTF-8");
    printEncoding(text, UTF_8);
    printEncodedBits(text, UTF_8);
    System.out.println();

    System.out.println("UTF-16");
    printEncoding(text, UTF_16BE);
    printEncodedBits(text, UTF_16BE);
    System.out.println();

    System.out.println("UTF-32");
    printEncoding(text, Charset.forName("UTF-32"));
    printEncodedBits(text, Charset.forName("UTF-32"));
  }

  private static void printCodePoints(final String text)
  {
    text
      .codePoints()
      .forEach(cp -> System.out.print(
        new String(new int[] { cp }, 0, 1) + " - "));
    System.out.println();
  }

  private static void printEncodedBits(final String text, final Charset charset)
  {
    text
      .codePoints()
      .forEach(cp -> {
        final String s = new String(new int[] { cp }, 0, 1);
        final byte[] bytes = s.getBytes(charset);
        for (byte enc : bytes)
        {
          final String bits = String
            .format("%8s", Integer.toBinaryString(enc & 0xFF))
            .replace(' ', '0');
          System.out.print(bits + " ");
        }
        System.out.print(" - ");
      });
    System.out.println();
  }

  private static void printEncoding(final String text, final Charset charset)
  {
    text
      .codePoints()
      .forEach(cp -> {
        final String s = new String(new int[] { cp }, 0, 1);
        final byte[] bytes = s.getBytes(charset);
        for (byte enc : bytes)
        {
          System.out.printf("%02x ", enc);
        }
        System.out.print(" - ");
      });
    System.out.println();
  }

}
