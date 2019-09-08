/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2019, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

*/
package us.fatehi.whatacharacter;


import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 * See https://github.com/lyndseypadget/java-strings-article
 */
public class CloseEnoughComparator
  implements Comparator<String>
{

  public int compare(final String obj1, final String obj2)
  {
    if (obj1 == null)
    {
      return -1;
    }
    if (obj2 == null)
    {
      return 1;
    }
    if (obj1.equals(obj2))
    {
      return 0;
    }

    final Collator usCollator = Collator.getInstance(Locale.US);
    usCollator.setStrength(Collator.PRIMARY);
    return usCollator.compare(obj1, obj2);
  }

  public static void main(String[] args)
  {
    final String s1 = "bleu fonce";
    final String s2 = "Bleu foncé    ";

    final Comparator<String> comparator = new CloseEnoughComparator();
    final int comparison = comparator.compare(s1, s2);

    System.out.printf("\"%s\" and \"%s\" compares to %d", s1, s2, comparison);
  }

}
