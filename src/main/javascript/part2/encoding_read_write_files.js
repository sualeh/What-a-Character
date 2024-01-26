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


  // ------------------------------------------------------------
  // Write a file

  const fs = require('fs');

  let original = "Aß東𐐀";

  fs.writeFile('test.txt', original, 'utf-8', function (err) {
    // Ignore errors
  });

  // ------------------------------------------------------------
  // Read a file

  fs.readFile('test.txt', 'utf-8', function (err, data) {
    // Ignore errors
    // Write what was read
    console.log(data);
  });

  // ------------------------------------------------------------
  // Read a file with wrong encoding
  // Does not report errors

  fs.readFile('test.txt', 'utf-16le', function (err, data) {
    // Reads unexpected characters
    console.log(data);
  });

  // ------------------------------------------------------------
}

main();
