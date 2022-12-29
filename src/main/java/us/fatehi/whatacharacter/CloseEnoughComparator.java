/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2023, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

*/
package us.fatehi.whatacharacter;


import java.text.Collator;
import java.util.Locale;

public class CloseEnoughComparator
{

  public static void main(String[] args)
  {
    // Demonstrates Unicode collation algorithms implemented in Java, which allow
    // comparison of strings for similarity, with different levels of accuracy
    // See https://github.com/lyndseypadget/java-strings-article

    final String s1 = "bleu fonce";
    final String s2 = "Bleu foncé    ";

    final Collator usCollator = Collator.getInstance(Locale.US);
    usCollator.setStrength(Collator.PRIMARY);
    final int comparison = usCollator.compare(s1, s2);

    System.out.printf("\"%s\" and \"%s\" compares to %d%n", s1, s2, comparison);
  }

}
