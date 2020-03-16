package us.fatehi.whatacharacter;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesFiles1
{

  public static void main(final String args[])
    throws Exception
  {
    Properties properties = new Properties();
    InputStream stream =
      PropertiesFiles1.class.getResourceAsStream("/properties1.properties");
    properties.load(new InputStreamReader(stream, StandardCharsets.UTF_8));

    System.out.println(properties.get("property1"));
  }

}
