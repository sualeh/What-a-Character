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

german_word = "straße"
german_upper = german_word.upper()
german_lower = german_upper.lower()

print(f'German "street" - "{german_word}" - length {len(german_word)}')
print(f'Converted to uppercase - "{german_upper} - length {len(german_upper)}"')
print(f'Converted to lowercase - "{german_lower} - length {len(german_lower)}"')

print()

greek_word = "ΣΚΎΛΟΣ"
greek_upper = greek_word.upper()
greek_lower = greek_upper.lower()

print(f'Greek "dog" - "{greek_word}" - length {len(greek_word)}')
print(f'Converted to uppercase - "{greek_upper}"')
print(f'Converted to lowercase - "{greek_lower}"')

print()

german_char = "ß"
german_char_upper = german_char.upper()
print(f"{german_char} becomes {german_char_upper} in uppercase")
