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

public class Encodings {

  public static void main(String[] args) {

    "Aß東𐐀".codePoints().forEach(cp -> {
      System.out.println();
      System.out.println("-------------------------------");
      System.out.println(Character.toString(cp));
      System.out.println();

      System.out.println("UTF-8");
      printEncoding(cp, UTF_8);
      printEncodedBits(cp, UTF_8);
      System.out.println();

      System.out.println("UTF-16");
      printEncoding(cp, UTF_16BE);
      printEncodedBits(cp, UTF_16BE);
      System.out.println();

      System.out.println("UTF-32");
      printEncoding(cp, Charset.forName("UTF-32"));
      printEncodedBits(cp, Charset.forName("UTF-32"));
    });
  }

  private static void printEncodedBits(final int cp, final Charset charset) {
    final String s = Character.toString(cp);
    final byte[] bytes = s.getBytes(charset);
    for (byte enc : bytes) {
      final String bits = String.format("%8s", Integer.toBinaryString(enc & 0xFF)).replace(' ', '0');
      System.out.print(bits + " ");
    }
    System.out.println();
  }

  private static void printEncoding(final int cp, final Charset charset) {
    final String s = Character.toString(cp);
    final byte[] bytes = s.getBytes(charset);
    for (byte enc : bytes) {
      System.out.printf("%02x ", enc);
    }
    System.out.println();
  }

}
