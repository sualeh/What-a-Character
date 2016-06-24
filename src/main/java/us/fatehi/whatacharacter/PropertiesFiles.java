package us.fatehi.whatacharacter;


import java.util.Properties;

public class PropertiesFiles
{

  public static void main(final String args[])
    throws Exception
  {
    Properties properties = new Properties();
    properties
      .load(PropertiesFiles.class.getResourceAsStream("properties.properties"));

    System.out.println(properties.get("property1"));
    System.out.println(properties.get("property2"));
  }

}
