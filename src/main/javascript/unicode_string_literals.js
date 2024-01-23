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

function printUnicode(ch) {
  console.log(toUnicode(ch));
}

function toUnicode(ch) {
  let code = ch.charCodeAt(0);
  return `\\u${code.toString(16).padStart(4, '0')}`;
}

function main() {
  // How to use Unicode characters in string and character literals
  // The hexadecimal values can be in uppercase or lowercase
  // The characters are always in the Basic Multilingual Plane

  // Character literals

  char1 = 'a';
  console.log(char1);

  char2 = '\u00EA';
  console.log(char2);

  char3 = '\\';
  console.log(char3);


  // \\uHHHH
  // where H is a case-insensitive hexadecimal character

  str1 = "a\u00ea\u00f1\u00fcc";
  console.log(str1);

  str2 = "A\u00EA\u00F1\u00FCC";
  console.log(str2);


  // 'DESERET CAPITAL LETTER LONG I' - 𐐀

  cp1 = String.fromCodePoint(0x010400);
  console.log(cp1);
  console.log(cp1.length); // 1
  console.log(Array.from(cp1).length);  // 2


  // Character escape sequences

  printUnicode('\t');
  printUnicode('\b');
  printUnicode('\n');
  printUnicode('\r');
  printUnicode('\f');
  printUnicode('\'');
  printUnicode('\"');
  printUnicode('\\');
}

main();
