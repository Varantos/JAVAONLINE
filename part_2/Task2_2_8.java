package byepam.javaonline.part_2;

import global.Global;

/* Задача 2.8
* 	 В числовой матрице поменять местами два столбца  местами, т. е. все элементы одного столбца поставить 
*	 на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит 
*	 пользователь с клавиатуры.
*/
public class Task2_2_8 {
	public static void main(String[] args) {
		int n=3; // размерность матрицы
		int m=5;
		
		int i=0; // счетчики элементов
		int j=0;

		int tmp=0;
		
		int[][] a = new int[n+1][m+1];// создаем матрицу
		a=Global.GenMatrixINT_rnd( n+1, m+1); // генерируем элементы
		
		 // выбор пользователем стлбцов замены	
		System.out.println("\n-----------------------------------------");
		int k=Global.InPutIntVal("Введите номер первого столбика для замены: ");
		int p=Global.InPutIntVal("Введите номер второго столбика для замены: ");
		
		if (k>n || p>m) {
			System.out.println("Номера столбиков выходят за пределы размерности!\nЗапустите программу снова!");
			System.exit(0);
		}
		
		System.out.println("\n-----------------------------------------"); 
		System.out.print("\t"+k+"\t"+p+"\n"); 
		
		for (i=0;i<=n;i++) {
			System.out.println();
			for (j=0;j<=m;j++) { 	
					if( (j==k) || (j==p) ) System.out.print("\t"+a[i][j]);

			}
		}
		System.out.println("\n-----------------------------------------");
		// меняем местами столбики
		for (i=0;i<=n;i++) {
			tmp=a[i][k];
			a[i][k]=a[i][p];
			a[i][p]=tmp;
		}
		// Выводим в консоль полученную матрицу
		System.out.println();
		System.out.print("№");
		for (i=0;i<=m;i++) System.out.print("\t"+i);
		System.out.println();
		for (i=0;i<=n;i++) { 	
			System.out.println();
			System.out.print(i);
			for (j=0;j<=m;j++) { 	
				System.out.print("\t"+a[i][j]);
			}
		}	
		
		
		
		
		
	}
}