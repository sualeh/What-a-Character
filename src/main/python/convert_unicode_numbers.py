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
    # Demonstrates number parsing functions can handle numeric values from
    # other (non-English) languages
    hindiNumber: str = "१२३४५६७८९०"
    number: int = int(hindiNumber)
    print(f"{hindiNumber} = {number}")


if __name__ == "__main__":
    main()
