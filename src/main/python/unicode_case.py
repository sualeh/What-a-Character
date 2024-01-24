"""

What a Character
https:#github.com/sualeh/What-a-Character
Copyright (c) 2016-2024, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http:#creativecommons.org/licenses/by-sa/4.0/.

"""


def main():

  # Unicode support for converting case

  # ----------------------------------------
  # Lowercase

  greekWord = "ΣΚΎΛΟΣ" # dog
  greekLower = greekWord.toLowerCase() # "σκύλος"

  print(f"lower of {greekWord} is {greekLower}");
  print(f"length of lower {greekLower} is {greekLower.length}");

  # ----------------------------------------
  # Uppercase

  germanWord = "straße" # street
  germanUpper = germanWord.toUpperCase() # "STRASSE"

  print(f"upper of {germanWord} is {germanUpper}")
  print(f"length of lower {germanUpper} is {germanUpper.length}")

  # ----------------------------------------


if __name__ == "__main__":
    main()
