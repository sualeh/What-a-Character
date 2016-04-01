/*

Unicode Learning
https://github.com/sualeh/unicode-learning
Copyright (c) 2016, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but 
WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 

This work is licensed under the Creative Commons Attribution-ShareAlike 
4.0 International License. To view a copy of this license, visit 
http://creativecommons.org/licenses/by-sa/4.0/. 

*/
package us.fatehi.whatacharacter;


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
                                       1,
                                       2,
                                       3,
                                       4,
                                       5
    };
    final String string2 = "qrstuv";

    stream.write(string1.getBytes());
    stream.write(bytes1);
    stream.write(string2.getBytes());

    final byte[] byteArray = stream.toByteArray();
    System.out.println(Arrays.toString(byteArray));

  }

}
