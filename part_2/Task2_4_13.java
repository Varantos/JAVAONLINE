package byepam.javaonline.part_2;

import java.util.Locale;
import java.util.Scanner;

/* Задача 4.13
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где  n  -  заданное натуральное число больше 2.  Для 
 * решения задачи использовать декомпозицию.
 */
		
public class Task2_4_13 {
	static boolean ifprime(int n){
		   for (int i = 2; i < Math.round(Math.sqrt(n)); i++) {
	        	if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }	
	 static void pair(int num){
	        System.out.print("Близнецы: \n");
	        for (int i = num; i <= 2*num - 2 ; i++) {
	           if (ifprime(i) && ifprime(i + 2) )
	                          System.out.println(i + ", " + (i + 2) + "; ");// 
	        }
	        System.out.println();
	 }
	static int input_intVal(String msg) {   
		int val = 0;  
			Scanner scanIn = new Scanner(System.in);
			scanIn.useLocale(Locale.getDefault());    
			do {
			    System.out.print(msg);
			    if (scanIn.hasNextInt()) {
			        val = scanIn.nextInt();
			        break;
			    } else scanIn.next();
			} while (true);
			return val;
		}
	public static void main(String[] args) {
		int num=input_intVal("введите число:");
		pair(num);
	
		
	}
	
}
