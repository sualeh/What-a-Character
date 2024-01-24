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
    // Demonstrates how to use Unicode characters in string and character literals
    // The hexadecimal values can be in uppercase or lowercase
    // The characters may be in any Unicode plane

    // ----------------------------------------
    // Character literals

    ch1 = 'a'
    ch2 = '東' // (Not an ASCII character!)
    ch3 = '𐐀' // (Not a BMP character!)
    // ch4 = '\' // (Backslash is a syntax error!)

    console.log(ch1 + " " + ch2 + " " + ch3)

    // ----------------------------------------
    // Unicode notation
    // \\uHHHH
    // where H is a case-insensitive hexadecimal character

    ch5 = '\u00EA'; // ‘ê’
    str1 = "a\u00ea\u00f1\u00fcc"; // “aêñüc”
    str2 = "A\u00EA\u00F1\u00FCC"; // “AêñüC”

    console.log(ch5 + "\n" + str1 + "\n" + str2)

    // ----------------------------------------
    // Unicode notation
    // \\uHHHH with surrogate pairs 
    // for characters outside the BMP

    str3 = "\uD801\uDC00"; // ‘𐐀’

    console.log(str3);
    console.log("length: " + str3.length);
    console.log("code points: " + Array.from(str3).length);

    // ----------------------------------------
    // Code point notation
    // 0xHHHHHH 
    // specifying code point plane and code point
    // for characters outside the BMP

    cp1 = 0x010400; // 𐐀
    str4 = String.fromCodePoint(cp1);

    console.log(str4);
    console.log("length: " + str4.length);
    console.log("code points: " + Array.from(str4).length);

    // ----------------------------------------
}

main()
