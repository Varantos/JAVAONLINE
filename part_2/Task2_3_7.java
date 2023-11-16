package byepam.javaonline.part_2;

import global.Global;

/*Задача 3.7
 * Пусть  даны  две  неубывающие  последовательности  действительных  чисел 
*           a(1), a(2),...a(m)   и   b(1), b(2),...a(m) 
*  Требуется указать те места, на которые нужно вставлять элементы второй последовательности 
*  в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
*/
public class Task2_3_7 {
	public static void main(String[] args) {
		int m1=5;
		int m2=5;
		int m1m2=m1*2;
		int i=0;		
		int j=0;
		int[] a = new int[m1m2+1];	// создаем и заполняем первый массив
	
			for (i=0;i<=m1;i++)		
				a[i] =(int) Math.round(Math.random()*40);
			
			int[] b = new int[m2+1];	// создаем и заполняем второй массив
		
			for (i=0;i<=m2;i++)		
				b[i] =(int) Math.round(Math.random()*40);
		
		ShellSort(m1, a);	
		ShellSort(m2, b);
		
		System.out.println("\n\nСортировано a:");
		for (i=0;i<=a.length-1;i++) System.out.print("\t"+a[i]);

		System.out.println("\n\nСортировано b:");
		for (i=0;i<=b.length-1;i++) System.out.print("\t"+b[i]);
		System.out.println("\n\nНомера вставки:");
		
		if (b[0]<=a[0]) GoReplaceOne(m1, 0, a, b[0]);
		if (b[0]>=a[0]) GoReplaceOne(m1+1, 1, a, b[1]);
		
		
		System.out.println("\n");
		for (i=0;i<=a.length-1;i++) System.out.print("\t"+a[i]);
		
		
		
		for (i=0;i<=m1;i++) { // по массиву а
			for (j=0;j<=m2;j++){ // по массиву  b
			     if (b[i]<=a[j] ) {
		
			    	  GoReplaceOne(m1+i-1, i, a, b[j]);
			
			}
		}
	}
		
			
			System.out.println("\n");
	
			for (i=0;i<=a.length-1;i++) System.out.print("\t"+a[i]);
			
		//--------------------------------	
			 
			
			
	}
	//------------------------------------------------
	static void GoReplaceOne(int m, int k, int a[], int rpl){
		 int i=0;
 		 for( i=m;i>=k;i--) a[i+1]=a[i];
		 a[k]=rpl;
	}
	//------------------------------------------------
	static int BinarySearch5 (int a[], int low, int high, int key){
	    int mid;
	    mid=low+((high-low)/2);
	    
	    if (low==high)
	        return low;

	    if (key>a[mid])
	        return BinarySearch5 (a, mid+1, high, key);
	    else if (key < a[mid])
	        return BinarySearch5 (a, low, mid, key);

	    return mid;
	}
//------------------------------------------------------
	static void ShellSort(int m, int a[]){
	    int i, j, step;
	    int tmp;
	    for (step = m/2; step>0; step/=2)
	        for (i = step; i<m; i++){
	            tmp = a[i];
	            for (j=i; j>= step; j-= step){
	                if (tmp<a[j-step])
	                    a[j]=a[j-step];
	                else
	                    break;
	            }
	            a[j] = tmp;
	        }
}


}
