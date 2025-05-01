/*
* 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
* - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
* - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
*/

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
      Scanner input = new Scanner( System.in );
        
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        
      input.close();
        
    if ( x1 > x2 ) 
    System.out.println( x1 ) ;

    if ( x1 < x2 ) 
    System.out.println( x2 );

    if ( x1 == x2 ) 
    System.out.println( x1 = x2 );
  
    int z = x1 + x2;
    System.out.println( z ); 
    
    int x = x1 - x2;
    System.out.println( x );
    
    int c = x1 % x2;
    System.out.println( c );
    
    int v = x1 * x2;
    System.out.println( v );
  
  }
}
