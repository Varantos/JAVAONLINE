package byepam.javaonline.part_2;
/* Задача 1.3
 *   Дан массив действительных чисел а1,а2,а3,...an. Размерности n.
 *   Подсчитать сколько в нем положительных, отрицательных и нулевых элементов.
 */
import global.Global;

public class Task2_1_3 {
	 public static void main(String[] args) {
	int i  =0;
	int sum=0;
	
	int n		 =Global.InPutIntVal("введите размерность массива n: ");
	double[] a = new double[n];
	a 		 = Global.GenVectorDbl_rnd(n);  //заполняем и выводим массив вконсоль
	
	System.out.print("\nПоложительные элементы sum: ");
	for(i=0; i<=n-1;i++)    //Находим: положительные и суммируем
		if (a[i]>0) sum++;
	System.out.print(sum);
	
	sum=0;
	System.out.print("\nОтрицательные элементы sum: ");
	for(i=0; i<=n-1;i++)    //Находим: отрицательные и суммируем
		if (a[i]<0) sum++;
	System.out.print(sum);

	sum=0;
	System.out.print("\nНулевые  элементы  sum:     ");
	for(i=0; i<=n-1;i++)    //Находим: нулевые и суммируем
		if (a[i]==0) sum++;
	System.out.print(sum);
	}
	
}
