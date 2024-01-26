/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2024, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

*/
package us.fatehi.whatacharacter.other;


import java.util.SortedMap;
import java.util.TreeMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SupplementaryCharacters
{

  public static void main(final String[] args)
    throws Exception
  {
    // Some of the Java APIs are not aware of Unicode characters outside
    // of the Basic Multilingual Plane.

    // A character outside of the Basic Multilingual Plane is
    // represented by a surrogate pair.
    final int cp = 0x010400; // 'DESERET CAPITAL LETTER LONG I' - 𐐀
    final SortedMap<String, String> map =
      new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    map.put("character",
            new StringBuffer()
              .appendCodePoint(cp)
              .toString());
    map.put("code point", String.valueOf(cp));
    map.put("Unicode name", Character.getName(cp));
    map.put("Unicode block",
            Character.UnicodeBlock
              .of(cp)
              .toString());
    map.put("Unicode script",
            Character.UnicodeScript
              .of(cp)
              .toString());
    map.put("count of char", String.valueOf(Character.charCount(cp)));
    final Gson gson = new GsonBuilder()
      .setPrettyPrinting()
      .create();
    System.out.println(gson.toJson(map));
    System.out.println();

    // String gives the length including surrogate characters, NOT the
    // number of Unicode characters
    final String text = "text" + new StringBuffer().appendCodePoint(cp);
    System.out.println(text);
    // Using a StringBuffer to delete characters can cause problems,
    // since it is not aware of Supplementary Plane characters
    final String textCorrupted = new StringBuffer(text)
      .deleteCharAt(4)
      .toString();
    System.out.println(textCorrupted);
  }

}
