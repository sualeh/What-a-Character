package us.fatehi.whatacharacter;


import java.io.UnsupportedEncodingException;

public class Substring
{

  public static void main(String[] args)
    throws UnsupportedEncodingException
  {
    // Some of the Java APIs are not aware of Unicode characters outside
    // of the Basic Multilingual Plane.

    // A character outside of the Basic Multilingual Plane is
    // represented by a surrogate pair.
    final int cp = 0x01D4AE;
    System.out.println(String
      .format("character: %s - code point: %d - %s in %s; character count: %d",
              new StringBuffer().appendCodePoint(cp),
              cp,
              Character.getName(cp),
              Character.UnicodeBlock.of(cp),
              Character.charCount(cp)));

    // String gives the length including surrogate characters, NOT the
    // number of Unicode characters
    final String text = new StringBuffer().appendCodePoint(cp).toString();
    System.out.println(text);
    System.out.println("length: " + text.length());
    System.out.println("code point: " + text.codePointAt(0));

    // Using a StringBuffer to delete characters can cause problems,
    // since it is not aware of Supplementary Plane characters
    final String textDeleted = text.substring(0, 1) + 'j';
    System.out.println(textDeleted);
    System.out.println("length: " + textDeleted.length());
    System.out.println("code point: " + textDeleted.codePointAt(0));
  }

}
