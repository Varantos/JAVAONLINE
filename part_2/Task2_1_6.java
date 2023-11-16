package byepam.javaonline.part_2;
/* Задача 1.6
 *   Задана  последовательность  N  вещественных  чисел.  
 *   Вычислить  сумму  чисел,  порядковые  номера  которых 
 *   являются простыми числами.
 */
import global.Global;
public class Task2_1_6 {
		 public static void main(String[] args) {
			 int n=Global.InPutIntVal("введите размерность массива n: ");
			 int i=0;
			 double sum=0;
			 double[] a = new double[n];
			 
			 a = Global.GenVectorDbl_rnd(n);  //заполняем и выводим массив в консоль

			 for (i=0;i<=n-1;i++){
				 if (TestPrime(i)==true) sum=sum+a[i];
			 }
			  
			 System.out.println("\nСумма элементов с простыими индексами: "+sum);
		 }
		 
static boolean TestPrime(int cnt) {	//элементареная проверка числа на простоту
	boolean flag=false;
	int i=0; 
	int divs=0;
	
	for (i=2;i<cnt-1;i++ ) {
		if (cnt%i==0) divs++;
	} 
	if (divs==0) flag=true;
	return flag;	
}
}
