package us.fatehi._working;


public class UnicodeStringLiterals
{

  public static void main(String[] args)
  {
    String original1 = "a\u00ea\u00f1\u00fcc";
    System.out.println(original1);
    
    String original2 = "A\u00EA\u00F1\u00FCC";
    System.out.println(original2);
  }

}
