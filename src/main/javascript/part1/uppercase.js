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


function main() {

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

  greekWord = "ΣΚΎΛΟΣ"; // dog
  greekUpper = greekWord.toUpperCase();
  greekLower = greekUpper.toLowerCase();

  console.log(`Greek "dog" - "${greekWord}" - length ${greekWord.length}`);
  console.log(`Converted to uppercase - "${greekUpper}"`);
  console.log(`Converted to lowercase - "${greekLower}"`);

  // Break
  console.log();


  // ----------------------------------------
  // Upper case

  germanWord = "straße"; // street
  germanUpper = germanWord.toUpperCase();
  germanLower = germanUpper.toLowerCase();

  console.log(`German "street" - "${germanWord}" - length ${germanWord.length}`);
  console.log(`Converted to uppercase - "${germanUpper}" - length ${germanUpper.length}`);
  console.log(`Converted to lowercase - "${germanLower}" - length ${germanLower.length}`);

  // Break
  console.log();


  // ----------------------------------------
}

main();
