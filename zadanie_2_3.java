//3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо написать программу, которая выведет в консоль все чётные числа. 

import java.util.*;

public class Program {
    public static void main(String[] args) {
      
    int [] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for ( int i = 0; i < array1.length; i++) {
      if(array1[i] %2 == 0)
      System.out.print( array1 [i] + ", ");
    }
  }
}
