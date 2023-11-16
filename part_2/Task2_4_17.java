package byepam.javaonline.part_2;
/* Задача 4.17
 *Из заданного числа вычли сумму его  цифр. Из результата вновь вычли сумму его цифр и т.д. 
 *Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Task2_4_17 { 
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
	}//------------------------------------------
	static int sum_nums(int n) { //сумма цифр числа
		int sum=0;
		   if (n < 10) return 1;
		   while(n != 0){
		       //Суммирование цифр числа
		        sum += (n % 10);
		        n/=10;
		}
	
    return sum;
	}//------------------------------------------
 	static int minus_nums(int num, int cnt) { // разность число-суммацифр
 		int sum=sum_nums(num);
 		if (num-sum==0) return cnt;
	return minus_nums(num-sum,cnt+1);
 	}//------------------------------------------
public static void main(String[] args) {
 	 int number=input_intVal("Задайте число: ");
 	 System.out.print("Сумма цифр: "+sum_nums(number)+"\n");
	 System.out.println("количество итераций (число-суммацифр): "+minus_nums(number,1)); 
}
}
