"""

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2023, Sualeh Fatehi.

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
    # ch2 = '\' # (Backslash is a syntax error!)
    ch3 = '東'
    ch4 = '𐐀'
    print(f"{ch1}, {ch3}, {ch4}")


if __name__ == "__main__":
    main()
