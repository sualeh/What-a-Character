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
  // Encoding round trip

  let original = "Aß東𐐀";

  let utf8Bytes = new TextEncoder().encode(original);
  let roundTrip = new TextDecoder().decode(utf8Bytes);

  console.log(roundTrip);

  // ------------------------------------------------------------
  // Encoding errors (none?)

  original = "Aß東𐐀";

  utf8Bytes = new TextEncoder().encode(original);
  roundTrip = new TextDecoder("utf-16").decode(utf8Bytes);

  // NOTE: No encoding errors are reported!
  console.log(roundTrip);

  // ------------------------------------------------------------
}

main();
