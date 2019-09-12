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


import java.util.regex.Pattern;

public class MatchUnicodeCaseInsensitive
{

  public static void main(String[] args)
  {

    // Demonstrates how to use regular expressions that can match
    // Unicode characters in a case-insensitive fashion

    final String lowerGreek = "σκύλος";
    final String upperGreek = "ΣΚΎΛΟΣ";
    final Pattern patternGreek = Pattern
      .compile(lowerGreek, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    System.out.println(String.format(
      "Unicode case-insensitive match for Greek words %s = %s is %s",
      lowerGreek,
      upperGreek,
      patternGreek.matcher(upperGreek).matches()));

    // When a lower -case character results in more than one uppercase character,
    // there is no match
    final String lowerGerman = "straße";
    final String upperGerman = "STRASSE";
    final Pattern patternGerman = Pattern
      .compile(lowerGerman, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    System.out.println(String.format(
      "Unicode case-insensitive match for German word %s = %s is %s",
      lowerGerman,
      upperGerman,
      patternGerman.matcher(upperGerman).matches()));

  }

}
