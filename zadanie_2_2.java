//2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

import java.util.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
      Scanner input = new Scanner( System.in );
        
        String x1 = input.nextLine();
        String x2 = input.nextLine();
        
      input.close();
      
    if ( x1. equals (x2) )System.out.println( "Строки идентичны" ); 
      else System.out.println( "Строки неидентичны" );
    
  }
}
