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


public class UnsignedChar
{

  public static void main(final String[] args)
  {
    final short sh1 = -20;
    final char ch1 = (char) sh1;
    final int int1 = (int) ch1;
    final int int2 = (int) sh1;
    System.out.println(String.valueOf(sh1));
    System.out.println(String.valueOf(ch1));
    System.out.println(String.valueOf(int1));
    System.out.println(String.valueOf(int2));
  }

}
