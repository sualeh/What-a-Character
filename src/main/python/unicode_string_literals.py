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


def print_unicode(ch):
    print(to_unicode(ch))


def to_unicode(ch):
    return "\\u{:04x}".format(ord(ch))


def main():
    # How to use Unicode characters in and character literals
    # The hexadecimal values can be in uppercase or lowercase
    # The characters may be in any Unicode plane

    char1 = "a"
    print(char1)

    char2 = "\u00EA"
    print(char2)

    char3 = "\\"
    print(char3)

    original1 = "a\u00ea\u00f1\u00fcc"
    print(original1)

    original2 = "A\u00EA\u00F1\u00FCC"
    print(original2)

    original3 = "\\"
    print(original3)

    # Character escape sequences
    print_unicode("\t")
    print_unicode("\b")
    print_unicode("\n")
    print_unicode("\r")
    print_unicode("\f")
    print_unicode("'")
    print_unicode('"')
    print_unicode("\\")


if __name__ == "__main__":
    main()
