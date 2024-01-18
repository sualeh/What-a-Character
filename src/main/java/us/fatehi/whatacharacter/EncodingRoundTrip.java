/*
 * 
 * What a Character https://github.com/sualeh/What-a-Character Copyright (c) 2016-2024, Sualeh
 * Fatehi.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * This work is licensed under the Creative Commons Attribution-ShareAlike 4.0 International
 * License. To view a copy of this license, visit http://creativecommons.org/licenses/by-sa/4.0/.
 * 
 */
package us.fatehi.whatacharacter;


public class EncodingRoundTrip {

  public static void main(final String[] args) throws Exception {
    String original = "Some string Aß東𐐀";
    byte[] utf8Bytes = original.getBytes("UTF-8");
    String roundTrip = new String(utf8Bytes, "UTF-8");
    System.out.println(roundTrip);
  }

}
