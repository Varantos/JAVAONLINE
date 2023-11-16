package byepam.javaonline.part_2;
/* Задача 3.1
 * 	Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * 	Объединить их в один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м 
 *   элементами  первого,  при  этом  не  используя дополнительный массив.
 */

import global.Global;

public class Task2_3_1 {
	public static void main(String[] args) {
		int m1=5; 	    // размерность первого массива	
		int m2=10; 	    // размерность второго массива
		int k=4; 		// натуральное число к

		int m1m2=m1+m2; // размерность первого массива, увеличенного на колличество элементов второго
		int i=0; 		// счетчики элементов массивов
		int j=0;
		
		int[] vctr1 = new int[m1m2+1];	// создаем и заполняем первый массив
	//	vctr1 = Global.GenVectorInt_rnd(m1m2+1);  //заполняем и выводим массив вконсоль
		for (i=1;i<=m1;i++)		
			vctr1[i] =(int) Math.round(Math.random()*40);
		
		int[] vctr2 = new int[m2+1];	// создаем и заполняем второй массив
		//vctr2 = Global.GenVectorInt_rnd(m2+1);  //заполняем и выводим массив вконсоль
		for (i=1;i<=m2;i++)		
			vctr2[i] =(int) Math.round(Math.random()*40);
		
		System.out.println("УСЛОВИЕ: VECTOR1[1.."+m1+"] ; VECTOR2[1.."+m2+"] ; k="+k+"\n" );
		
		System.out.print("№\t\t");
		for (i=1;i<=m1m2;i++) 
			System.out.print("\t"+i);
		
		System.out.print("\n\nVECTOR1:\t");
		for (i=1;i<=m1;i++)
			System.out.print("\t"+vctr1[i]);

		System.out.print("\n\nVECTOR2:\t");
		for (i=1;i<=m2;i++) 
			System.out.print("\t"+vctr2[i]);
	
		//-------------------------------------------------------------------
		
		//j=m2;			// в объединенном массиве по размерноти сдвигаем все элементы к концу с к-того
	    for(i=m1m2+1; i>=(m1m2-(m1-k)+1); i--) {
	    	 vctr1[i-1]=vctr1[i-m2-1];
	    	 vctr1[i-m2-1]= 0;
	   // 	 j--;
	     }
	    
	    
	    
	    
		System.out.print("\n\nСДВИГ C "+k+" ЭЛЕМЕНТА :") ;
		for (i=1;i<=m1m2;i++)
			System.out.print("\t"+vctr1[i]);
		
	    for (j=1; j<=m2;j++) vctr1[k+j-1]= vctr2[j]; // вставка  вектор2 в вектор1	 
	    
		System.out.print("\n\nВСТАВКА :\t") ;	
	    
		for (i=1;i<=m1m2;i++)
			System.out.print("\t"+vctr1[i]);

		} 
}
