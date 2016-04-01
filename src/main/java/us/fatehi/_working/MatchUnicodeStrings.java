package us.fatehi._working;


import java.util.regex.Pattern;

public class MatchUnicodeStrings
{

  public static void main(String[] args)
  {
    final Pattern digit = Pattern.compile("[0-9]*");
    final Pattern unicode_digit = Pattern.compile("\\p{Nd}*");
    final String hindiNumber = "१२३४५६७८९०";
    System.out.println(String.format("digit match = %s", digit.matcher(hindiNumber).matches()));
    System.out.println(String.format("Unicode digit match = %s", unicode_digit.matcher(hindiNumber).matches()));
  }

}
