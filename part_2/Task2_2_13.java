package byepam.javaonline.part_2;
/* Задача 2.12
 * Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */
public class Task2_2_13 {
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
		a= GenMatrixINT_rnd(n, m); 
		
		//-------------СОРТИРОВКА по возрастанию!--------------------------------	
		for ( i = 0; i < m; ++i) {		// перебор столбиков
		  for ( j = 0; j < n; ++j) {
		     for ( int k=j+1; k<n; k++ ){	//сортировка выбором  по возрастанию
		   	   if ( a[j][i]>a[k][i] ) {
		       	 tmp	  =a[k][i];
			 	 a[k][i]  =a[j][i];
	             a[j][i]=tmp;
		        }
		     }
		  }
		}
	 //-------------------------------------------------    
		System.out.println("\n\nОтсортированы столбики по возрастанию!");
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
	
				for ( i = 0; i < m; ++i) {		// перебор столбиков
				  for ( j = 0; j < n; ++j) {
				     for ( int k=j+1; k<n; k++ ){	//сортировка выбором  по убыванию
				   	   if ( a[k][i]>a[j][i] ) {
				       	 tmp	  =a[k][i];
					 	 a[k][i]  =a[j][i];
			             a[j][i]=tmp;
				        }
				     }
				  }
				}
		 //-------------------------------------------------	
		System.out.println("\n\nОтсортированы столбики по убыванию!");
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
