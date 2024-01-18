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
package us.fatehi.whatacharacter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class EncodingReadWriteFiles {

  public static void main(final String[] args) throws Exception {
    final String original = "Aß東𐐀";

    final OutputStream fos = new FileOutputStream("test.txt");
    final Writer wtr = new OutputStreamWriter(fos, "UTF-8");
    wtr.write(original);
    wtr.close();

    final InputStream fis = new FileInputStream("test.txt");
    final Reader rdr = new InputStreamReader(fis, "UTF-8");
    final BufferedReader brdr = new BufferedReader(rdr);
    final String text = brdr.readLine();
    brdr.close();

    System.out.println(text);
  }

}
