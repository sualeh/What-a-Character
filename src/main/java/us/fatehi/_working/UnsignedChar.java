package us.fatehi._working;


public class UnsignedChar
{

  public static void main(final String[] args)
  {
    final short sh1 = -20;
    final char ch1 = (char) sh1;
    final int int1 = (int) ch1;
    final int int2 = (int) sh1;
    System.out.println(String.valueOf(sh1));
    System.out.println(String.valueOf(ch1));
    System.out.println(String.valueOf(int1));
    System.out.println(String.valueOf(int2));
  }

}
