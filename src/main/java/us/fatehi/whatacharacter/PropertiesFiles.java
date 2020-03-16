/*

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2020, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

*/
package us.fatehi.whatacharacter;


import java.util.Properties;

public class PropertiesFiles
{

  public static void main(final String args[])
    throws Exception
  {
    Properties properties = new Properties();
    properties.load(PropertiesFiles.class.getResourceAsStream(
      "/properties.properties"));

    System.out.println(properties.get("property1"));
    System.out.println(properties.get("property2"));
    System.out.println(properties.get("property编"));
  }

}
