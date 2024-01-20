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

import re
import regex

# Demonstrates how to use regular expressions that can match
# Unicode characters in a case-insensitive fashion

lower_greek = "σκύλος"
upper_greek = "ΣΚΎΛΟΣ"
pattern_greek = re.compile(lower_greek, re.IGNORECASE)
matches = bool(pattern_greek.match(upper_greek))
print(
    f"Unicode case-insensitive match for Greek words {lower_greek} = {upper_greek} is {matches}"
)

# When a lower-case character results in more than one uppercase character,
# there is no match
lower_german = "straße"
upper_german = "STRASSE"
pattern_german = regex.compile(lower_german, regex.IGNORECASE | regex.UNICODE)
matches = bool(pattern_german.match(upper_german))
print(
    f"Unicode case-insensitive match for German word {lower_german} = {upper_german} is {matches}"
)
