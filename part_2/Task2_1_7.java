package byepam.javaonline.part_2;
/* Задача 1.7
 *   Данa  действительные числа а[1],a[2],a[3]....a[n].  
 *   max(a[1]+a[2n],a[2]+a[2n-1],...,a[n]+a[n+1])
 *   
 *  [a1, a2, a3, ......., an , ............... , a2n]
 *  max(a1 + a2n, a2 + a2n-1, a3+ a2n-2, a4+ a2n-3, a4+ a2n-3,........, an + an+1)
 */
import global.Global;
public class Task2_1_7 {
	 public static void main(String[] args) {
		 int i=0;
		 int j=0;	
		 int n=Global.InPutIntVal("введите размерность массива n: ");		 
		 double[] a = new double[n*2];	     // задаем удвоенное значение элементов массива
		 a = Global.GenVectorDbl_rnd(n*2);   // заполняем случайными числами и выводим массив в консоль
		 double midl=a[1]+a[n];
		 System.out.println();
		 System.out.printf("Итоговый:\n");
		 for ( i = 0, j = 2*n - 1; i < j; i++, j--) { // первый пробег по i: [0,   n-1]  по нарастанию 
			 										  // второй пробег по j: [2n-1,n-1]  по убыванию
		        midl =  a[i] + a[j];				  // cуммируем элементы с начала и с конца массива пока i<j (пока  i и j не станут равны n-1 )
		        System.out.printf(" %.2f\t", midl);   // выводим результат 
		 }
	 }
}

