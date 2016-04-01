package us.fatehi._working;


import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * See <a href=
 * "http://stackoverflow.com/questions/15925458/iso-8859-1-encoding-and-binary-data-preservation"
 * >ISO-8859-1 encoding and binary data preservation</a>
 */
public class StringEncodingOfBinaryData
{

  private static final Charset CHARSET_ENCODING = StandardCharsets.ISO_8859_1;

  // StandardCharsets.UTF_8; // Does not work

  public static void main(String[] args)
    throws Exception
  {
    byte[] b = new byte[256];
    for (int i = 0; i < b.length; i++)
    {
      b[i] = (byte) i;
    }
    String s = new String(b, CHARSET_ENCODING);
    byte[] b2 = s.getBytes(CHARSET_ENCODING);
    System.out.println("Are the bytes equal: " + Arrays.equals(b, b2));
  }

}
