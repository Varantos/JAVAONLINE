package byepam.javaonline.part_2;
import java.util.Locale;
import java.util.Scanner;

/* Задача 1.1
 *   В массиве A[N] занесены натуральные числа.
 *   Найти сумму тех элементов, которые кратны данному К.
 */

public class Task2_1_1 {
	
	//ввод вещественного числа  int
	public static int InPutIntVal(String msg) {   
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
//заполняем массив-вектор случайными вещественными значениями [0; 40]
	public static int[] GenVectorInt_rnd(int n) { 
		int[] vector = new int[n];
		int cnt	= 0;
		System.out.println("Начальный массив: ");
		for (cnt=0;cnt<=n-1;cnt++) { 		
			vector[cnt]=(int) Math.round(Math.random()*40);
			System.out.print("\t"+vector[cnt]);
		}
		return vector;
	}
	public static void main(String[] args) {
		int   cnt=0;
		int   sum=0;
		int   n	 =InPutIntVal("введите размерность массива n: "); 	// задаем размерность массива
		int   k	 =InPutIntVal("введите число k: "); 				// задаем число k
		int[] a  =new int[n]; 											// объявляем и инициализируем массив
		
		System.out.print("Массив:  ");
		a= GenVectorInt_rnd(n);// заполняем массив случайными целыми значениями в пределах 100
		
		System.out.print("\n"+"Кратные: "); 
		for (cnt=0;cnt<=n-1;cnt++) { 			// перебираем элементы массива
			if ( a[cnt]%k ==0 ) {				// проверяем кратность каждого элемента
				System.out.print(a[cnt]+"  ");	// вывод в консоль кратных
				sum=sum+a[cnt];					// подсчет суммы кратных
			}
		}
		System.out.print("\nСумма кратных элементов: "+sum); //выводим сумму
		
	}
}
