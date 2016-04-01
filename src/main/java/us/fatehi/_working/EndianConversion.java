package us.fatehi._working;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class EndianConversion
{

  public static void main(final String[] args)
    throws IOException
  {

    final byte[] bytes1 = new byte[] {
                                       1,
                                       2,
                                       3,
                                       4,
                                       5,
                                       6
    };
    System.out.println(Arrays.toString(bytes1));

    final byte[] bytes2 = new EndianConversion()
      .convertBigToLittleEndian(bytes1);
    System.out.println(Arrays.toString(bytes2));
  }

  public byte[] convertBigToLittleEndian(final byte[] inputByteArray)
  {
    // Error and boundary condition checks
    if (inputByteArray == null)
    {
      return null;
    }
    if (inputByteArray.length == 0)
    {
      return new byte[0];
    }
    if ((inputByteArray.length % 2) != 0)
    {
      throw new IllegalArgumentException("Input byte array should have an even length");
    }

    // Allocate big-endian buffer for the source
    final ByteBuffer bigEndianBuffer = ByteBuffer
      .allocate(inputByteArray.length);
    bigEndianBuffer.order(ByteOrder.BIG_ENDIAN);

    // Allocate little-endian buffer for the destination
    final ByteBuffer littleEndianBuffer = ByteBuffer
      .allocate(inputByteArray.length);
    littleEndianBuffer.order(ByteOrder.LITTLE_ENDIAN);

    // Populate data, and rewind to beginning of the data
    bigEndianBuffer.put(inputByteArray);
    bigEndianBuffer.rewind();

    // Grab two bytes (== a word == short) at a time, and flip them
    while (bigEndianBuffer.hasRemaining())
    {
      final short shortValue = bigEndianBuffer.getShort();
      littleEndianBuffer.putShort(shortValue);
    }

    // Produce output
    final byte[] ouputByteArray = littleEndianBuffer.array();
    return ouputByteArray;
  }

}
