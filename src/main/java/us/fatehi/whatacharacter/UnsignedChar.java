/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2020, Sualeh Fatehi.

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
    // Demonstrates that a character is an unsigned data type
    // A short and a char are both 16 bits
    // However, a short can hold negative values, but a char cannot
    // You can prove this by assigning both to an int value

    final short sh1 = (short) -20;
    final char ch1 = (char) -20;

    System.out.printf("short %s converted to int is %d%n",
                      String.valueOf(sh1),
                      (int) sh1);
    System.out.printf("char %s converted to int is %d%n",
                      String.valueOf(ch1),
                      (int) ch1);
  }

}
