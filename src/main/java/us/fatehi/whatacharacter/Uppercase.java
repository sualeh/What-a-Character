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


public class Uppercase
{

  public static void main(final String[] args)
  {
    // Uppercasing or lowercasing a character may result in more than
    // one character. Also, depending on the position of a character in
    // a word, you can get a different uppercase or lowercase character.

    final String word1 = "Straße";
    final String word2 = word1.toUpperCase();

    System.out
      .println(String.format("\"%s\" - length %d", word1, word1.length()));
    System.out
      .println(String.format("\"%s\" - length %d", word2, word2.length()));
  }

}
