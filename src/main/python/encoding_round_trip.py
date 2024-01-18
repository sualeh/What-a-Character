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

import codecs


def main():
    original: str = "Some string Aß東𐐀"
    utf8_bytes: bytes = codecs.encode(original, encoding="utf-8")
    round_trip: str = codecs.decode(utf8_bytes, "utf-8")
    print(round_trip)


if __name__ == "__main__":
    main()
