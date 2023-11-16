package byepam.javaonline.part_2;
/* Задача 4.15
* 		Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую 
*	последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
*/

import java.util.Locale;
import java.util.Scanner;

public class Task2_4_15 {
	
	static int numbering(int n) { // количество цифр
		int k = 0;
		for (; n > 0; n /= 10)
			k++;
		return k;
	}
	
	 static int[] create_vector(int  k, int z) { //  создаем вектор числа  
		 int[] vec = new int[k]; // задаем сам массив
		 for (;z>0;z/=10){
		    if (k!=0) {
		    	vec[k-1]=z%10;
		        k--;
		    }
		 }
		 return vec;
	 }
	
	 static boolean exam_number(int [] vectorN) {
		 boolean flg=false;
		 int i=0;
		 int k=vectorN.length;
		 int cnt=vectorN[0];
		 for (i=0;i<k;i++) {
			
			 if (vectorN[i]==cnt) {
				flg=true;
				cnt++;
				continue;
			}
			else{
				flg=false;
				break;
			}	
	
		}//for
		 return flg;		 
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
	int number=input_intVal("Введите число: ");
	int k=numbering(number);
	int[] vectorN=create_vector( k, number);
	if (exam_number(vectorN)) 
		 System.out.println("\nПоследовательность есть!");
	else 
		 System.out.println("\nПоследовательности нет!");
 	}

}
