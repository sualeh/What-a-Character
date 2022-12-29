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
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringsToBytes
{

  public static void main(String[] args)
  {

    // When converting from strings to bytes and back, always specify an
    // encoding explicitly. Use the same encoding system to decode, or
    // you will get garbage back, or perhaps an encoding exception.

    final Charset UTF8 = StandardCharsets.UTF_8;
    final Charset UTF16 = StandardCharsets.UTF_16BE;

    final String string1 = "Str१२३";
    System.out.println("Original string: \"" + string1 + "\"");

    final byte[] utf8bytes = string1.getBytes(UTF8);
    final byte[] utf16bytes = string1.getBytes(UTF16);

    System.out.println(
      "String encoded as UTF-8:  " + Arrays.toString(utf8bytes));
    System.out.println(
      "String encoded as UTF-16: " + Arrays.toString(utf16bytes));

    final String string2 = new String(utf8bytes, UTF16);
    final String string3 = new String(utf16bytes, UTF8);

    System.out.println(
      "UTF-8 encoded bytes read in with UTF-16 decoding: \"" + string2 + "\"");
    System.out.println(
      "UTF-16 encoded bytes read in with UTF-8 decoding: \"" + string3 + "\"");
  }

}
