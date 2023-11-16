package byepam.javaonline.part_2;
/* Задача 2.3
* 	 Дана матрица. Вывести k-ю строку и p-й столбец матрицы/
*/
import global.Global;
public class Task2_2_3no {
	public static void main(String[] args) {

		int n=10;
		int m=15
				;
		int i=0;
		int j=0;
		String str1="\t";
		String str2="\t";
		
		int k =Global.InPutIntVal("номер строки (k<n): ");
		int p =Global.InPutIntVal("номер столбца(p<m): ");
		int[][] a = new int[n][m];
	
		a=Global.GenMatrixINT_rnd( n, m+1); 
	
		System.out.println("\n");
		for (i=0;i<=p-1;i++)str1=str1+"\t"; // количеств TAB-ов до нужного нам столбца
		
		System.out.println("\n\nВыводим к="+k+"-ю строку, p="+p+"-й столбец: \n");
		
		for (i=0;i<=m;i++) System.out.print("\t"+i); System.out.println("\n"); // выводим индексы столбцов
		

		for (i=0;i<=n-1;i++) {										// пробег по столбцам
			 System.out.println(str1+a[i][p]); 						// печатаем столбик - p
			for (j=0;j<=m;j++) { 									// пробег по строкам
				if (i==k-1) System.out.print("\t"+a[k][j]); 		//печатаем строку - k
				
			}		
		}
		
	
		
	}
}
