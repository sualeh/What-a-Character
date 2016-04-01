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
package us.fatehi.whatacharacter;


import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * See <a href=
 * "http://stackoverflow.com/questions/15925458/iso-8859-1-encoding-and-binary-data-preservation"
 * >ISO-8859-1 encoding and binary data preservation</a>
 */
public class StringEncodingOfBinaryData
{

  private static final Charset CHARSET_ENCODING = StandardCharsets.ISO_8859_1;

  // StandardCharsets.UTF_8; // Does not work

  public static void main(String[] args)
    throws Exception
  {
    byte[] b = new byte[256];
    for (int i = 0; i < b.length; i++)
    {
      b[i] = (byte) i;
    }
    String s = new String(b, CHARSET_ENCODING);
    byte[] b2 = s.getBytes(CHARSET_ENCODING);
    System.out.println("Are the bytes equal: " + Arrays.equals(b, b2));
  }

}
