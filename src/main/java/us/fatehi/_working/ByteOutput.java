package us.fatehi._working;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutput
{

  public static void main(String[] args)
    throws IOException
  {
    final ByteArrayOutputStream stream = new ByteArrayOutputStream();

    final String string1 = "abcdef";
    final byte[] bytes1 = new byte[] {
        1, 2, 3, 4, 5
    };
    final String string2 = "qrstuv";

    stream.write(string1.getBytes());
    stream.write(bytes1);
    stream.write(string2.getBytes());

    final byte[] byteArray = stream.toByteArray();
    System.out.println(Arrays.toString(byteArray));

  }

}
