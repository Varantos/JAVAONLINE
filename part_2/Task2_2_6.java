package byepam.javaonline.part_2;

import global.Global;

/* Задача 2.7
* 	 Cформировать квадратную матрицу порядка n по заданному образцу
* 	
* 					1 1 1 1 1 1 1 1 1
* 					0 1 1 1 1 1 1 1 0 
* 					0 0 1 1 1 1 1 0 0 
* 					0 0 0 1 1 1 0 0 0
* 					0 0 0 0 1 0 0 0 0
* 					0 0 0 1 1 1 0 0 0
* 					0 0 1 1 1 1 1 0 0 
* 					0 1 1 1 1 1 1 1 0
*  					1 1 1 1 1 1 1 1 1
* 
*/
public class Task2_2_6 {
	public static void main(String[] args) {
	
	int i=0;
	int j=0;
	
	 

	int n  =Global.InPutIntVal("введите число Z: ");
	
	
	if (n <= 2 || n%2!=0){ 	// проверка при вводес кв: четное колличество элементов 
		System.out.println("n - нечетное число!");
		System.exit(0);
	}
	
	int[][] a = new int[n+1][n+1]; // иницализация массива
	
	System.out.print("      ");
	for (i=0;i<=n;i++) System.out.print(" "+i+" ");
	System.out.println("\n");
	
	for (i=0;i<=n;i++) {    //заполняем матрицу		по столбцам
		
		for (j=0;j<=n;j++) { //по сторокам до (j-1)  - до главной диагонали
			//         верхний сектор                          нижний сектор
			if ( (  (i <= j) && (j <= n - i )  ) || ( (i >= j) && (j >= n - i ) )  ) {
				a[i][j] = 1;
			}
		}
	}

	for (i=0;i<=n;i++) { //выводим полученную матрицу
		System.out.print("  "+i+"    ");
		for (j=0;j<=n;j++) { 
			 System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}
}
	}
