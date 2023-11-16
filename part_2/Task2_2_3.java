package byepam.javaonline.part_2;

/* Задача 2.3
* 	 Дана матрица. Вывести k-ю строку и p-й столбец матрицы/
*/
import global.Global;
public class Task2_2_3 {
	public static void main(String[] args) {

		int n=10;
		int m=15;
		int i=0;
		int j=0;
		String str1="\t";
		String str2="\t";
		
		int k =Global.InPutIntVal("номер строки (k<n): ");
		if (k>n||k<0) { 
			System.out.println("k:: неверное количество строк!");
			System.exit(0);
		}
		int p =Global.InPutIntVal("номер столбца(p<m): ");
		if (p>n||p<0) { 
			System.out.println("p:: неверное количество столбцов!");
			System.exit(0);
		}
		int[][] a = new int[n][m];
		a=Global.GenMatrixINT_rnd( n, m); 
		System.out.println("\n");
		for (i=0;i<=p-1;i++)str1=str1+"\t"; // количеств TAB-ов до нужного нам столбца
		System.out.println("\n\nВыводим к="+k+"-ю строку, p="+p+"-й столбец: \n");
		for (i=0;i<=m-1;i++) System.out.print("\t"+i); System.out.println("\n"); // выводим индексы столбцов
		for (i=0;i<=n-1;i++) {		// пробег по столбцам
			 System.out.print(i);
			 if (i!=k) {
				 System.out.print(str1+a[i][p]);// печатаем столбик -  		
			 }
			 else {
				 	for (j=0;j<=m-1;j++) {									// пробег по строкам
				 		System.out.print(str2+a[k][j]); 		//печатаем строку - k
				 	}
			 }
			 System.out.println();
			}		
		}
}
