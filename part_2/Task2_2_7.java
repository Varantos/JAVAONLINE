package byepam.javaonline.part_2;
/* Задача 2.7
* 	 Cформировать квадратную матрицу порядка n по заданному образцу
* 					A[i][j]=sin((I*I-J*J)/n)
* 	и подсчитать колличество положительтных элементов в ней
*/
public class Task2_2_7 {
	public static void main(String[] args) {
		int n=5; 		// n - не равно нулю! Размерность матрицы.
		int i=0; 		// Счетчики элементов
		int j=0;
		int nums=0; 	// Для суммирования
		
		double[][] a = new double[n][n]; // иницализация массива 
		nums=0;
		for (i=1;i<=n-1;i++) { 
			System.out.println();
			for (j=0;j<=n-1;j++) { 
				a[i][j]=Math.sin ( (i*i-j*j)/n );
				if (a[i][j]>0) nums++;			// считаем положительные элементы
				System.out.printf("\t %.2f", a[i][j]); // вывод матрицы
			}
		}
		System.out.print("\n\nКолличество положительных элементов в матрице NUMS ="+ nums);// выводим сумму элементов
		
	}		
}
