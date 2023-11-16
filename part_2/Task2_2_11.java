package byepam.javaonline.part_2;
/* Задача 2.11
 * Матрицу 10x20 заполнить случайными числами от 0 до 15.
 *  Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз
 * 
 */

public class Task2_2_11 {
	public static void main(String[] args) {

	int n=10; 		// n -  Размерность матрицы.
	int m=20; 		// m -  Размерность матрицы.

	int i=1; 		// Счетчики элементов
	int j=1;
	int cnt5=0; 	// Для суммирования 5
	int a[][]  = new int [n+1][m+1];
	int[] sum_n5 = new int[m+1];// создаем вектор количеств 5ки по строчкам		
	//------------------------------------------
	System.out.println("Начальная матрица: ");// заполняем
	for (i=1;i<=n;i++) 	
		for (j=1;j<=m;j++) 	
			a[i][j]=(int) Math.round(Math.random()*15);
	//------------------------------------------	
	System.out.print("№");
	for (i=1;i<=m;i++) System.out.print("\t"+i);// выводим матрицу
	System.out.println();
	for (i=1;i<=n;i++) { 	
		System.out.println();
		System.out.print(i);
		for (j=1;j<=m;j++) { 	
			System.out.print("\t"+a[i][j]);
		}
	}	
	//------------------------------------------
	System.out.println("");// подсчет количества пятерок и вввод  в консоль количеств больше трех
	for (i=1;i<=n;i++) { 	
			sum_n5[i]=cnt5;
			cnt5=0;
			for (j=1;j<=m;j++) { 
				
				if (a[i][j]==5) cnt5+=1;	
			}
			if (cnt5>=3) System.out.print("\t ВЫПОЛНЕНО :: "+i+"-я строка; кол-во 5ок: "+cnt5+"\n");
			
		}	
	//------------------------------------------
	System.out.println();	
	cnt5=0;
	for (i=1;i<=n;i++) {// проверка если пятерок не хватает везде и условие задачи не выполняется 
		if ( sum_n5[i]<3 ) cnt5+=1;	
	}
	if (cnt5==n) System.out.print("Нет строк, удовлетворяющих условию задачи!");

  }
}
