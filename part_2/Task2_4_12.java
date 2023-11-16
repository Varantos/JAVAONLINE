package byepam.javaonline.part_2;

import java.util.Locale;
import java.util.Scanner;

/* Задача 4.12
 *  Даны  натуральные числа К  и  N.  
 * Написать метод(методы)  формирования массива  А,
 * элементами  которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task2_4_12 {
	
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
	
	
	static boolean Sum_exam(int number, int  sum) { //разбиваем число  
		 int sk=0;
		 boolean flg=false;
		 
		 for (;number>0;number /=10){
		         sk=sk+number%10;
		 }
		 if (sk==sum) flg=true;
		 sk=0;
		 return flg;
	}
	
public static void main(String[] args) {
		int K=input_intVal("Введите (сумма цифр) K: ");
		int N=input_intVal("Введите (предел массива) N: ");
		for  (int i=0; i<=N; i++) 
			if (Sum_exam(i, K)==true)  System.out.print(i+" ");
}
	
	
	
}
