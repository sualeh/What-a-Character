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


import java.util.regex.Pattern;

public class MatchUnicodeStrings
{

  public static void main(String[] args)
  {
    final Pattern digit = Pattern.compile("[0-9]*");
    final Pattern unicode_digit = Pattern.compile("\\p{Nd}*");
    final String hindiNumber = "१२३४५६७८९०";
    System.out.println(String.format("digit match = %s", digit.matcher(hindiNumber).matches()));
    System.out.println(String.format("Unicode digit match = %s", unicode_digit.matcher(hindiNumber).matches()));
  }

}
