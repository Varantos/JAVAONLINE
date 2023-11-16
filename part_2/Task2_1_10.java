package byepam.javaonline.part_2;
/* Задача 1.10
* 	 Дан целочисленный  массив  с  количеством  элементов  п.  
* 	 Сжать  массив,  выбросив  из  него  каждый  второй 
*     элемент (освободившиеся элементы заполнить нулями). 
*    Примечание. Дополнительный массив не использовать)
*/
public class Task2_1_10 {
	public static void main(String[] args) {
					//без оптимизации
		int n=10;
		int sz=n;
		int i=0,j=0;
		int tmp=0;
		int[] a = {10,11,12,13,14,15,16,17,18,19,20};

		System.out.println("Индексы:");	
		for (i=0;i<=n;i++) 	System.out.print("\t"+i);
		System.out.println();
		
		System.out.println("Элементы:");
		for (i=0;i<=n;i++) 	System.out.print("\t"+a[i]);
		System.out.println();
		
		for ( i = 0; i < n; ++i) // Заменяем каждый элемент с четным индексом нолем
	        if( i%2==0) { a[i]=0; sz--;}  
	    
		System.out.println("Замены:");
		for (i=0;i<=n;i++) 	System.out.print("\t"+a[i]);
		
		System.out.println();
		
		//сортируем относительно нулей и отсекаем лишнее
		for( i=0; i < n; i++) {            // i - номер прохода
		    for( j = n; j > i; j-- ) {     // внутренний цикл прохода
		      if ( a[j-1] == 0 ) {
		      tmp=a[j-1]; a[j-1]=a[j]; a[j]=tmp;
		    }
		  }
		}
		System.out.println("Сжато:");	
		for (i=0;i<=sz;i++) 	System.out.print("\t"+a[i]);
		
		
	}

}
