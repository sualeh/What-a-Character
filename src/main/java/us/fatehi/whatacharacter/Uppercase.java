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

    final String germanWord = "straße";
    final String germanUpper = germanWord.toUpperCase();
    final String germanLower = germanUpper.toLowerCase();

    System.out.format("German \"street\" - \"%s\" - length %d%n",
                      germanWord,
                      germanWord.length());
    System.out.format("German \"street\" in uppercase - \"%s\" - length %d%n",
                      germanUpper,
                      germanUpper.length());
    System.out.format("German \"street\" in lowercase - \"%s\" - length %d",
                      germanLower,
                      germanLower.length());

    final String greekWord = "σκύλος";
    final String greekUpper = greekWord.toUpperCase();
    final String greekLower = greekUpper.toLowerCase();

    System.out.format("Greek \"dog\" in uppercase - \"%s\"%n", greekUpper);
    System.out.format("Greek \"dog\" in lowercase - \"%s\"%n", greekLower);

    // Character conversions may not be done correctly
    
    final char germanChar = 'ß';
    final char germanCharUpper = Character.toUpperCase(germanChar);
    System.out.format("%s becomes %s in uppercase%n", germanChar, germanCharUpper);
    
  }

}
