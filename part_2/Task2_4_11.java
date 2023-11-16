package byepam.javaonline.part_2;

import java.util.Locale;
import java.util.Scanner;

/* Задача 4.11
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
 */

public class Task2_4_11 {
	
	 static int input_intVal(String msg) {   
		int val = 0;  
		//try (
			Scanner scanIn = new Scanner(System.in);
//		{
			scanIn.useLocale(Locale.getDefault());    
			do {
			    System.out.print(msg);
			    if (scanIn.hasNextInt()) {
			        val = scanIn.nextInt();
			        break;
			    } else scanIn.next();
			} while (true);
	 //   }
		return val;
	}
	
	
	static int numbering(int n) { // размерность массива для цифр  
		 int k=0;
		 for (;n>0;n/=10)  k++;
		 
		 return k;
	}
	 
	static String compare(int k1, int k2) { // кол-во цифр
		String msg="";
		if (k1>k2)  msg="В первом больше цифр!";
		if (k1<k2)  msg="Во втором больше цифр!";  	
		if (k1==k2) msg="Одинаково цифр!";
		return msg;
	}
	 
	public static void main(String[] args) {
		int n1=input_intVal("Введите число1: ");
		int n2=input_intVal("Введите число2: ");
		System.out.println("\nЧисла: "+n1+" и "+n2);
		System.out.println(compare(numbering(n1),numbering(n2)));
	}
}
