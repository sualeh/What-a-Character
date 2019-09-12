package us.fatehi.whatacharacter;


import java.io.UnsupportedEncodingException;

public class Substring
{

  public static void main(String[] args)
  {

    // Some of the Java APIs are not aware of Unicode characters outside
    // of the Basic Multilingual Plane.
    // A character outside of the Basic Multilingual Plane is
    // represented by a surrogate pair.

    final int cp = 0x01D4AE;
    final String cpchar = new StringBuffer().appendCodePoint(cp).toString();

    System.out.println(String.format(
      "character: %s - code point: %d - %s in %s; character count: %d",
      cpchar,
      cp,
      Character.getName(cp),
      Character.UnicodeBlock.of(cp),
      Character.charCount(cp)));

    // String gives the length including surrogate characters, NOT the
    // number of Unicode characters
    System.out.println(cpchar);
    System.out.println("length: " + cpchar.length());
    System.out.println(
      "code point count: " + cpchar.codePointCount(0, cpchar.length()));

    // Using a StringBuffer to delete characters can cause problems,
    // since it is not aware of Supplementary Plane characters
    final String textDeleted = cpchar.substring(0, 1) + 'j';
    System.out.println(textDeleted);
    System.out.println("length: " + textDeleted.length());
    System.out.println("code point: " + textDeleted.codePointAt(0));
  }

}
