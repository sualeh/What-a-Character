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


public class UnsignedChar
{

  public static void main(final String[] args)
  {
    // Demonstrates that a character is an unsigned data type. A short
    // and a char are both 16 bits. A short can hold negative values,
    // but a char cannot. You can prove this by assigning both to an int
    // value.

    final int int0 = -20;
    final short sh1 = (short) int0;
    final char ch1 = (char) int0;
    final int int1 = (int) sh1;
    final int int2 = (int) ch1;

    System.out.println(String.format("short: %s converted to int: %d",
                                     String.valueOf(sh1),
                                     int1));
    System.out.println(String.format("char: %s converted to int: %d",
                                     String.valueOf(ch1),
                                     int2));
  }

}
