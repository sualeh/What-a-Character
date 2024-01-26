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
package us.fatehi.whatacharacter.part1;


import java.util.regex.Pattern;

public class MatchUnicodeCharacterCategories {

  public static void main(String[] args) {

    // Demonstrates how to use regular expressions that can match
    // Unicode character categories

    // ----------------------------------------
    // Patterns with Unicode classes

    boolean matches = false;

    final String hindiNumber = "१२३४५६७८९०";

    final Pattern digit = Pattern.compile("[0-9]+");
    matches = digit.matcher(hindiNumber).matches();

    System.out.printf("Plain digit match for %s using pattern %s is %s%n",
        hindiNumber,
        digit.pattern(), 
        matches);


    final Pattern standard_digit = Pattern.compile("\\d+");
    matches = standard_digit.matcher(hindiNumber).matches();
        
    System.out.printf("Standard digit match for %s using pattern %s is %s%n",
        hindiNumber,
        standard_digit.pattern(), 
        matches);


    final Pattern unicode_digit = Pattern.compile("\\p{Nd}+");
    matches = unicode_digit.matcher(hindiNumber).matches();
        
    System.out.printf("Unicode digit match for %s using pattern %s is %s%n",
        hindiNumber,
        unicode_digit.pattern(), 
        matches);
    
    // ----------------------------------------
  }

}
