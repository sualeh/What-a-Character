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

    # Uppercasing or lowercasing a character may result in more than
    # one character. Also, depending on the position of a character in
    # a word, you can get a different uppercase or lowercase character.

    
    # ----------------------------------------
    # Lower case

    greek_word = "ΣΚΎΛΟΣ" # dog
    greek_upper = greek_word.upper()
    greek_lower = greek_upper.lower()

    print(f'Greek "dog" - "{greek_word}" - length {len(greek_word)}')
    print(f'Converted to uppercase - "{greek_upper}"')
    print(f'Converted to lowercase - "{greek_lower}"')

    print()

    # ----------------------------------------
    # Upper case

    # Official Unicode 5.1 Announcement
    # U+1E9E LATIN CAPITAL LETTER SHARP S
    # In particular, capital sharp s is intended for typographical
    # representations of signage and uppercase titles, and other
    # environments where users require the sharp s to be preserved in
    # uppercase. Overall, such usage is rare. In contrast, standard
    # German orthography uses the string "SS" as uppercase mapping for
    # small sharp s. Thus, with the default Unicode casing operations,
    # capital sharp s will lowercase to small sharp s, but not the reverse:
    # small sharp s uppercases to "SS". In those instances where the
    # reverse casing operation is needed, a tailored operation would be
    # required.
    # http:#unicode.org/versions/Unicode5.1.0/

    german_word = "straße"  # street
    german_upper = german_word.upper()
    german_lower = german_upper.lower()

    print(f'German "street" - "{german_word}" - length {len(german_word)}')
    print(f'Converted to uppercase - "{german_upper} - length {len(german_upper)}"')
    print(f'Converted to lowercase - "{german_lower} - length {len(german_lower)}"')

    print()


if __name__ == "__main__":
    main()
