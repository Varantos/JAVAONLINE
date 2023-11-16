package byepam.javaonline.part_2;
/* «адача 1.4
 *   ƒаны действительные числа: а1,а2,а3,...an.
 *   ѕомен€ть местами максимальный и минимальный элементы.
 */
import global.Global;
public class Task2_1_4 {
	 public static void main(String[] args) {
		int n=10;
		int i=0;
		int tmp=0;
		int max_i=0;
		int min_i=0;
		
			
		n=Global.InPutIntVal("введите размерность массива n: ");
		int[] a = new int[n];
		a = Global.GenVectorInt_rnd(n);  //заполн€ем и выводим массив вконсоль
				
		//поиск минимальногов массиве
		tmp=a[0];
		for (i=0;i<n;i++) 
			if (a[i]<tmp) { 
				min_i=i;
				tmp=a[i];
			}
		
		System.out.print("\nmin_i :: a("+min_i+")=");System.out.printf("%.2f\t\n",a[min_i]);

		//поиск минимального в массиве
		tmp=a[0];
		for (i=0;i<n;i++) 
			if (a[i]>tmp) {
				max_i=i;
				tmp=a[i];
			}
		
		System.out.print("max_i :: a("+max_i+")=");System.out.printf("%.2f\t\n",a[max_i]);

		//мен€ем местами максимальный и минимальноый
		tmp=a[min_i];
		a[min_i]=a[max_i];
		a[max_i]=tmp;
		
		System.out.println("»тоговый массив:");
		for(i=0; i<=n-1;i++)
			System.out.printf("%.2f\t",a[i]);
	 }
}
