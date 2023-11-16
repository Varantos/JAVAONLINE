package byepam.javaonline.part_2;
/* «адача 2.4
* 	 Cформировать квадратную матрицу по заданному образцу
* 	1	2	3	4	.....n-1	n
* 	n-1	n-2	n-3 n-4 .....2		1
*   1	2	3	4	.....n-1	n
*   n-1	n-2	n-3 n-4 .....2		1
* 
*/
public class Task2_2_4 {
	public static void main(String[] args) {
		int n=8;
		int i=0;
		int j=0;
		int[][] a = new int[n+1][n+1];
		
		System.out.print("\t");
		for (i=1;i<=n;i++) System.out.print("\t"+i);//выводим индексы
		System.out.print("\n");
		
		for (i=1;i<=n;i++) { // цикл по сторкам	- i
			System.out.print("\n"+i+"\t");
			
			//---------------
			if (i%2!=0) { //если i - нечетное
				for (j=1;j<=n;j++) { 									
					a[i][j]=j;
					System.out.print("\t"+a[i][j]);
				}//end of for-2
			}//end of if-1
			
			//---------------
			if(i%2==0) { //если i - четное
				for (j=n;j>=1;j--) { 								
					a[i][j]=j;
					System.out.print("\t"+a[i][j]);
				}//end of for-3
			
			}//end of if-2 
		
		}// end of for-1
		
	}
}