package byepam.javaonline.part_2;

import java.util.Locale;
import java.util.Scanner;

/* Задача 4.14
* 		Натуральное  число,  в  записи  которого  n  цифр,  называется числом  Армстронга,  
* 	если  сумма  его  цифр, возведенная  в  степень  n,  равна  самому числу.  
* 	Найти  все  числа  Армстронга  от  1  до  k.  Для  решения  задачи использовать декомпозицию.
* Контоль:
* 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 
* 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 
* 912985153. 
*/
public class Task2_4_14 {

	static int numbering(int n) { // количество цифр
		int k = 0;
		for (; n > 0; n /= 10)
			k++;
		return k;
	}

	static int create_armsum(int k, int number) { // число Армстронга
		int armst = 0;
		int z = number;
		for (; number > 0; number /= 10)
			armst = armst + (int) Math.pow(number % 10, k);
		return armst;
	}

	static boolean isarmstrong(int number) { //проверка на число Армстронга
		int k = numbering(number);
		if (number == create_armsum(k, number))
			return true;
		return false;
	}

	static int input_intVal(String msg) { //введите число
		int val = 0;
		Scanner scanIn = new Scanner(System.in);
		scanIn.useLocale(Locale.getDefault());
		do {
			System.out.print(msg);
			if (scanIn.hasNextInt()) {
				val = scanIn.nextInt();
				break;
			} else
				scanIn.next();
		} while (true);
		return val;
	}

	public static void main(String[] args) {
		int n=input_intVal("Введите число К: ");
		int k=numbering(n);
		for (int i=0; i<=n;i++)
			if ( isarmstrong(i) ) 	System.out.println("Число Армстронга: "+i); 
	
	}
}
