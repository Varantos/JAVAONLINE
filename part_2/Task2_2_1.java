package byepam.javaonline.part_2;

import global.Global;

/* Задача 2.1
* 	 Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
*/
public class Task2_2_1 {
	public static void main(String[] args) {
		int n=5;
		int m=10;
		int i=0;
		int j=0;
		
		int[][] a = new int[n][m];
		
		a=Global.GenMatrixINT_rnd( n, m); 
		
		System.out.println();		
		System.out.println();
		System.out.println("ВСЕ НЕЧЕТНЫЕ СТОЛБЦЫ( a(0,0)>a(n,m) ):");
		for (i=0;i<=n-1;i++) { 	       // пробег по столбцам
				System.out.println();  // перевод на новыю строку 
				for (j=0;j<=m-1;j++) { // пробег по строкам	
					if (j%2!=0 && a[0][j]>a[n-1][j]) {	// все нечетные стобцы, в которых mtrxd[0][0]>mtrxd[n-1][m-1]
						System.out.print("\t"+a[i][j]);	// вывод элемента
					}
				}
		}
	}
}
