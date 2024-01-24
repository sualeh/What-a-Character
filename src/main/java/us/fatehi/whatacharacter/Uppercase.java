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
package us.fatehi.whatacharacter;


public class Uppercase
{

  public static void main(final String[] args)
  {

    // Uppercasing or lowercasing a character may result in more than
    // one character
    // Also, depending on the position of a character in
    // a word, you can get a different uppercase or lowercase character

    // Official Unicode 5.1 Announcement
    // U+1E9E LATIN CAPITAL LETTER SHARP S
    // In particular, capital sharp s is intended for typographical
    // representations of signage and uppercase titles, and other
    // environments where users require the sharp s to be preserved in
    // uppercase. Overall, such usage is rare. In contrast, standard
    // German orthography uses the string "SS" as uppercase mapping for
    // small sharp s. Thus, with the default Unicode casing operations,
    // capital sharp s will lowercase to small sharp s, but not the reverse:
    // small sharp s uppercases to "SS". In those instances where the
    // reverse casing operation is needed, a tailored operation would be
    // required.
    // http://unicode.org/versions/Unicode5.1.0/

    // ----------------------------------------
    // Lower case

    final String greekWord = "ΣΚΎΛΟΣ"; // dog
    final String greekUpper = greekWord.toUpperCase();
    final String greekLower = greekUpper.toLowerCase();

    System.out.format("Greek \"dog\" - \"%s\" - length %d%n",
      greekWord,
      greekWord.length());
    System.out.format("Converted to uppercase - \"%s\"%n", 
      greekUpper);
    System.out.format("Converted to lowercase - \"%s\"%n", 
      greekLower);

    // Break
    System.out.println();


    // ----------------------------------------
    // Upper case

    final String germanWord = "straße"; // street
    final String germanUpper = germanWord.toUpperCase();
    final String germanLower = germanUpper.toLowerCase();

    System.out.format("German \"street\" - \"%s\" - length %d%n", 
        germanWord, 
        germanWord.length());
    System.out.format("Converted to uppercase - \"%s\" - length %d%n",
        germanUpper,
        germanUpper.length());
    System.out.format("Converted to lowercase - \"%s\" - length %d%n",
        germanLower,
        germanLower.length());

    // Break
    System.out.println();


    // ----------------------------------------
    // Character conversions may not be done correctly

    final char germanChar = 'ß';
    final char germanCharUpper = Character.toUpperCase(germanChar);
    System.out.format("%s becomes %s in uppercase%n",
        germanChar,
        germanCharUpper);

    // ----------------------------------------
  }

}
