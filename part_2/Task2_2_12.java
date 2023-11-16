package byepam.javaonline.part_2;

/* Задача 2.12
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
*/
public class Task2_2_12 {
	//заполняем массив-матрицу случайными целыми значениями [0; 40]
	public static int[][] GenMatrixINT_rnd(int n, int m) {  
		int[][] mtrx = new int[n][m];
		int i =0;
		int j =0;
		System.out.println("Начальная матрица: ");
		for (i=0;i<=n-1;i++) { 	
			for (j=0;j<=m-1;j++) { 	
			mtrx[i][j]=(int) Math.round(Math.random()*40);
			}
		}	
		
		System.out.print("№");
		for (i=0;i<=m-1;i++) System.out.print("\t"+i);
		System.out.println();
		for (i=0;i<=n-1;i++) { 	
			System.out.println();
			System.out.print(i);
			for (j=0;j<=m-1;j++) { 	
				System.out.print("\t"+mtrx[i][j]);
			}
		}	

		return mtrx;
	}
	
	
	public static void main(String[] args) {
	
	int m=10; 		// m -  Размерность матрицы.
	int n=5; 		// n -  Размерность матрицы.

	int i=0; 		// Счетчики элементов
	int j=0;
	int tmp=0;		// Для обмена
	
	int a[][]  = new int [n][m];

	//------------------------------------------
	a= GenMatrixINT_rnd(n, m); 
	//-------------СОРТИРОВКА по возрастанию!--------------------------------	
	for ( i = 0; i < n; ++i) {		// перебор строк
	  for ( j = 0; j < m; ++j) {
	     for ( int k=j+1; k<m; k++ ){	//сортировка выбором  по возрастанию
	   	   if ( a[i][j]>a[i][k] ) {
	       	 tmp	  =a[i][k];
		 	 a[i][k]  =a[i][j];
             a[i][j]=tmp;
	        }
	     }
	  }
	}
 //-------------------------------------------------    
	System.out.println("\n\nОтсортированы строки по возрастанию!");
	System.out.print("№");
	for (i=0;i<=m-1;i++) System.out.print("\t"+i);// выводим матрицу
	System.out.println();
	for (i=0;i<=n-1;i++) { 	
		System.out.println();
		System.out.print(i);
		for (j=0;j<=m-1;j++) { 	
			System.out.print("\t"+a[i][j]);
		}
	}	
	//-------------СОРТИРОВКА по убыванию!--------------------------------	
	for ( i = 0; i < n; ++i) {		// перебор строк
		  for ( j = 0; j < m; ++j) {
		     for ( int k=j+1; k<m; k++ ){	//сортировка выбором  по убыванию
		   	   if ( a[i][k]>a[i][j] ) {
		       	 tmp	  =a[i][k];
			 	 a[i][k]  =a[i][j];
	             a[i][j]=tmp;
		        }
		     }
		  }
		}
	 //-------------------------------------------------	
	System.out.println("\n\nОтсортированы строки по убыванию!");
	System.out.print("№");
	for (i=0;i<=m-1;i++) System.out.print("\t"+i);// выводим матрицу
	System.out.println();
	for (i=0;i<=n-1;i++) { 	
		System.out.println();
		System.out.print(i);
		for (j=0;j<=m-1;j++) { 	
			System.out.print("\t"+a[i][j]);
		}
	}	
	
  }
}

