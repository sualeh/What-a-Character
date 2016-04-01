package us.fatehi._working;


import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Charsets
{
  public static void main(final String[] args)
  {
    printCharsetDetails(Charset.defaultCharset());
    System.out.println();

    final SortedMap<String, Charset> availableCharsets = Charset
        .availableCharsets();
    for (final Charset charset: availableCharsets.values())
    {
      printCharsetDetails(charset);
    }
  }

  private static void printCharsetDetails(final Charset charset)
  {
    final SortedSet<String> aliases = new TreeSet<String>(charset.aliases());
    aliases.add(charset.name());
    final float averageBytesPerChar;
    final float maxBytesPerChar;
    if (charset.canEncode())
    {
      final CharsetEncoder encoder = charset.newEncoder();
      averageBytesPerChar = encoder.averageBytesPerChar();
      maxBytesPerChar = encoder.maxBytesPerChar();
    }
    else
    {
      averageBytesPerChar = 0;
      maxBytesPerChar = 0;
    }

    System.out.println(String
                       .format("%s max %d bytes, %s length",
                               aliases,
                               (int) maxBytesPerChar,
                               averageBytesPerChar != maxBytesPerChar? "variable": "fixed"));
  }

}
