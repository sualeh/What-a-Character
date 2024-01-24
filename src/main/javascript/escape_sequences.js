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
