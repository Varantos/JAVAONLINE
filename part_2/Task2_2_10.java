package byepam.javaonline.part_2;
/* Задача 2.10
* 	 Найти положительные элементы главной диагонали квадратной матрицы
*/
import global.Global;
public class Task2_2_10 {
	public static void main(String[] args) {
		int n=8;
		int i=0;
		int j=0;
		double[][] a = new double[n][n];// иницализация массива 
		a= Global.GenMatrixDbl_rnd(n,n);
		System.out.print("\n\nПоложительные элементы главной диагонали:  ");
		
		for (i=0;i<=n-1;i++) {   //заполняем матрицу		по столбцам
			for (j=0;j<=n-1;j++) { //по сторокам до (j-1)   до главной диагонали
				if ( (i==j) && (a[i][j]>0) )  System.out.printf("%.2f    ",a[i][j]);//если элемент в диагонали(i=j)?
			 																		// он положительный - выводим в консоль		
			}
		}

	}
}
