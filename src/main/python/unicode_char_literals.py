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

    ch1 = 'a'
    ch2 = "東" # (Not an ASCII character!)
    ch3 = "𐐀" # (Not a BMP character!)
    # ch4 = '\' # (Backslash is a syntax error!)

    print(f"{ch1} {ch2} {ch3}")


if __name__ == "__main__":
    main()
