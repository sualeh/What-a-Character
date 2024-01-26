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

    # ------------------------------------------------------------
    # Write a file

    string: str = "Aß東𐐀"

    # Create a StreamWriter object
    with open("test.txt", "w", encoding="utf-8") as writer:
        writer.write(string)

    # ------------------------------------------------------------
    # Read a file

    # Create a StreamReader object
    with open("test.txt", "r", encoding="utf-8") as reader:
        print(reader.read())

    # ------------------------------------------------------------
    # Read a file

    # Create a StreamReader object
    with open("test.txt", "r", encoding="utf-16le") as reader:
        print(reader.read())

    # ------------------------------------------------------------


if __name__ == "__main__":
    main()
