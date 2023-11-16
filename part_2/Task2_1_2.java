package byepam.javaonline.part_2;
/* Задача 1.2
 *   Дана последовательность действительных чисел а1,а2,а3,...an.
 *   Замеенить все элементы, большие Z, этим числом. подсчитаьт количество замен.
 */
import global.Global;
public class Task2_1_2 {
	 public static void main(String[] args) {
		int n  =Global.InPutIntVal("введите размерность массива n: ");
		int Z  =Global.InPutIntVal("введите число Z: ");
		int cnt=0; // колличество замен

		double[] a = new double[n];
		a = Global.GenVectorDbl_rnd(n);  //заполняем и выводим массив вконсоль
				
		for(int i=0; i<=n-1;i++)  		   // замена элементов массива больших Z самими числом Z
			if (a[i]>Z) {a[i]=Z; cnt++;};
		
		System.out.println();
		
		for(int i=0; i<=n-1;i++)
			System.out.printf("%.2f\t",a[i]);
		
		System.out.print("\nКоличество замен: "+cnt);	 
		 
	 }
	
}
