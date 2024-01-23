"""

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2024, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

"""

def main():
    # Demonstrates how to use Unicode characters in string and character literals
    # The hexadecimal values can be in uppercase or lowercase
    # The characters may be in any Unicode plane

    # ----------------------------------------
    # Character literals

    ch1 = 'a'
    ch2 = "東" # (Not an ASCII character!)
    ch3 = "𐐀" # (Not a BMP character!)
    # ch4 = '\' # (Backslash is a syntax error!)

    print(f"{ch1} {ch2} {ch3}")

    # ----------------------------------------
    # Unicode notation
    # \uHHHH
    # where H is a case-insensitive hexadecimal character

    ch5 = "\u00EA" # ‘ê’
    str1 = "a\u00ea\u00f1\u00fcc" # “aêñüc”
    str2 = "A\u00EA\u00F1\u00FCC" # “AêñüC”

    print(f"{ch5}\n{str1}\n{str2}")

    # ----------------------------------------
    # Unicode notation
    # \U00HHHHHH  
    # for characters outside the BMP

    str3 = "\U00010400"  # '𐐀'

    print(str3)
    print(f"length: {len(str3)}")

    # ----------------------------------------


if __name__ == "__main__":
    main()
