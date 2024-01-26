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
  // Unicode character categories

  // ----------------------------------------
  // Patterns with Unicode classes

  hindiNumber = "१२३४५६७८९०";

  digit = /[0-9]+/
  matches = digit.test(hindiNumber)
  
  console.log(`Plain digit match for ${hindiNumber} using pattern ${digit} ` +
    `is ${matches}`);
  
  
  standard_digit = /\d+/
  matches = standard_digit.test(hindiNumber)

  console.log(`Standard digit match for ${hindiNumber} using pattern ${standard_digit} ` +
    `is ${matches}`);
  
  
  unicode_digit = /\p{Nd}+/u
  matches = unicode_digit.test(hindiNumber)

  console.log(`Unicode digit match for ${hindiNumber} using pattern ${unicode_digit} ` +
    `is ${matches}`);

  // ----------------------------------------
}

main();
