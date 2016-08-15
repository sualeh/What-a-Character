/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but 
WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 

This work is licensed under the Creative Commons Attribution-ShareAlike 
4.0 International License. To view a copy of this license, visit 
http://creativecommons.org/licenses/by-sa/4.0/. 

*/
package us.fatehi.whatacharacter;


import java.util.regex.Pattern;

public class MatchUnicodeCaseInsensitive
{

  public static void main(String[] args)
  {
    // Demonstrates how to use regular expressions that can match
    // Unicode case-insensitive

    final Pattern pattern = Pattern
      .compile("σκύλος", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    System.out.println(String.format("Unicode case-insensitive match = %s",
                                     pattern.matcher("ΣΚΎΛΟΣ").matches()));
  }

}
