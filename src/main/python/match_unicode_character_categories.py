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

hindi_number = "१२३४५६७८९०"

# Non-Unicode matching
digit_regex = r"[0-9]*"
match_result = re.match(digit_regex, hindi_number)
matches = bool(match_result)
print(f"Match found for {digit_regex} - {matches}")

# Using digit character class
digit_regex = r"\d*"
match_result = re.match(digit_regex, hindi_number)
matches = bool(match_result)
print(f"Match found for {digit_regex} - {matches}")

# Using Unicode character categories
digit_regex = r"\p{Nd}*"
match_result = regex.match(digit_regex, hindi_number)
matches = bool(match_result)
print(f"Match found for {digit_regex} - {matches}")
