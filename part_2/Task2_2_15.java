package byepam.javaonline.part_2;
/* ЗХадача 2.15
 *  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task2_2_15 {
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
		for (i=0;i<=m-1;i++) System.out.print("\t"+(i+1));
		System.out.println();
		for (i=0;i<=n-1;i++) { 	
			System.out.println();
			System.out.print(i+1);
			for (j=0;j<=m-1;j++) { 	
				System.out.print("\t"+mtrx[i][j]);
			}
		}	
		return mtrx;
	}
//----------------------------------------------------
	public static void main(String[] args) {
		int m=5; 		// m -  Размерность матрицы.
		int n=7; 		// n -  Размерность матрицы.
		int i=0; 		// Счетчики элементов
		int j=0;
		int tmp=0;		// Для обмена
		int a[][]  = new int [n][m];
		a= GenMatrixINT_rnd(n, m); 
		int max=a[0][0];
		for (i=0;i<=n-1;i++) { 	
			for (j=0;j<=m-1;j++) { 	
				if	(a[i][j]>max) max= a[i][j];
			}
		}

		System.out.println("\n\nMAX= "+ max+"\n");	
		
		for (i=0;i<=n-1;i++) { 	
			for (j=0;j<=m-1;j++) { 	
				if	(a[i][j]%2==0)  a[i][j]=max;
			}
		}
		System.out.print("№");
		for (i=0;i<=m-1;i++) System.out.print("\t"+(i+1));
		System.out.println();
		for (i=0;i<=n-1;i++) { 	
			System.out.println();
			System.out.print(i+1);
			for (j=0;j<=m-1;j++) { 	
				System.out.print("\t"+a[i][j]);
			}
		}	
	}
}
