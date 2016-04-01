package us.fatehi._working;


public class ConvertUnicodeNumbers
{
  
  public static void main(String[] args)
  {
    final String hindiNumber = "१२३४५६७८९०";
    final int number = Integer.parseInt(hindiNumber);
    System.out.println(String.format("%s = %d", hindiNumber, number));
  }
  
}
