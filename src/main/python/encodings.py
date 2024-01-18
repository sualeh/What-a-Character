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


def encode(cp, encoding):
    char = chr(cp)
    encoded_char = char.encode(encoding)
    return encoded_char


def print_encoding(cp, encoding):
    encoded_char = encode(cp, encoding)
    hex_string = " ".join(hex(byte)[2:].zfill(2) for byte in encoded_char)
    print(hex_string)


def print_encoded_bits(cp, encoding):
    encoded_char = encode(cp, encoding)
    for byte in encoded_char:
        print(bin(byte)[2:].zfill(8), end=" ")
    print()


def main():
    text = "Aß東𐐀"

    for cp in map(ord, text):
        print()
        print("-------------------------------")
        print(chr(cp))
        print()

        print("UTF-8")
        print_encoding(cp, "utf-8")
        print_encoded_bits(cp, "utf-8")
        print()

        print("UTF-16")
        print_encoding(cp, "utf-16-be")
        print_encoded_bits(cp, "utf-16-be")
        print()

        print("UTF-32")
        print_encoding(cp, "utf-32-be")
        print_encoded_bits(cp, "utf-32-be")


if __name__ == "__main__":
    main()
