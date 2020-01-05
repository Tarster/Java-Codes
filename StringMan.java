import java.lang.System;
import java.lang.String;

class Main
{

  public static void main(String args[]){
  String str  =new String("When the going gets tough, ");
  String str2 =new String("the tough get going");

  System.out.println("Length of String: " + str.length());
  System.out.println("Character at position 5: " + str.charAt(5) );
  System.out.println("Index of character 'S': " + str.indexOf('S'));

  System.out.println("Compare To str2: " + str.compareTo(str2));

  System.out.println("Compare To str2 - Case Ignored: " + str.compareToIgnoreCase(str2));

  System.out.println("Contains sequence 'the': " + str.contains("the"));

  System.out.println("Convert to LowerCase: " + str.toLowerCase());

  System.out.println("Convert to UpperCase: " + str2.toUpperCase());

  System.out.println("Concatinating str and str2 " + str.concat(str2));
}
}
