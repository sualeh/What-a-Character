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

  // Demonstrates how to use regular expressions that can match
  // Unicode characters in a case-insensitive fashion

  // ----------------------------------------
  // Case insensitive patterns

  pattern = /σκύλος/iu
  matches = pattern.test("ΣΚΎΛΟΣ");

  console.log(
    `Unicode case-insensitive match for Greek words ${pattern} is ${matches}`)

  // ----------------------------------------
  // Failed match for multiple characters

  // When a lower -case character results in more than one uppercase character,
  // there is no match

  pattern = /"straße"/iu
  matches = pattern.test("STRASSE");

  console.log(
    `Unicode case-insensitive match for German word ${pattern} is ${matches}`)

  // ----------------------------------------
}

main();

