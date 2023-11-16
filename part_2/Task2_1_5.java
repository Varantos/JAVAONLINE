package byepam.javaonline.part_2;
/* Задача 1.5
 *   Даны целые числа: а1,а2,а3,...an.
 *   Вывести все элементы ai > i.
 */
import global.Global;
public class Task2_1_5 {
	 public static void main(String[] args) {
		
		 int n=Global.InPutIntVal("введите размерность массива n: ");
		 int i=0;
		 int[] a = new int[n];
		 a = global.Global.GenVectorInt_rnd(n);  //заполняем и выводим массив в консоль

		 System.out.println(); 
		 
		 for (i=0;i<n;i++)
			 System.out.print("\t"+i);  // порядковый номер элемента массива
	
		 
		 System.out.println("\nРезультат: ");
		 
		 for (i=0;i<n;i++) 
			 if (a[i]>i) { 				//если ai > i, выводим в консоль элемент массива 
				 System.out.print("\t"+a[i]);
				}
	 
	 
		 
	 }
		

}
