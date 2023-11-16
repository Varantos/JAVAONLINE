package byepam.javaonline.part_1;
/* Задача 3.7 
 *   Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
import global.Global;
public class Task1_3_8 {
	public static void main(String[] args) {
		int a=0; //число А 
		int	b=0; //число В
	    int i=0; //счетчик для А
	    int	j=0; //счетчик для B
	    int	k=0; //счетчик для итогового массива общих цифр
	    int[] arr1, arr2, arr3; // массивы цифр чисел А и В и массива общих цифр
	    arr1= new int[15];
	    arr2= new int[15];
	    arr3= new int[15];
      
        a=Global.InPutIntVal("введите число А: ");
        b=Global.InPutIntVal("Введите число B: ");
  
	    // формируем вектор цифр первого числа        
        while(a > 0){			// пока a>0
            arr1[i] = a % 10;	// для десятичной системы счисления делим на 10 и сохраняем 
            a = a / 10;			// делим число на 10 - берем следующий разряд 
            i++;				// увеличиваем счетчик цифр числа
        }
        int n=i;
        System.out.println("Вектор Первого числа: "); // выводим в консоль массив цифр числа для контроля
        for(j = 0; j < n; j++) System.out.print(" " + arr1[j]);
        System.out.println("");

        // аналогично формируем вектор цифр второго числа
       i=0;
       while(b > 0){
            arr2[i] = b % 10;
            b = b / 10;
            i++;
       } 
	   int m=i;
	   System.out.println("вектор второго числа: "); //выводим в консоль для контроля
	   for( j = 0; j < m; j++) System.out.print(" " + arr2[j]);

	   //находим общие цифры из обоих чисел: сравниваем цифры в обоих массивах
	   //и сохраняем только одинаковые цифры 
	   System.out.println();
	   System.out.println("Общие цифры: ");
	   k=0;
	   for ( i = 0; i < n; i++)
	    {
	        for (j = 0; j < m; j++)
	        {
	        	if (arr1[i]==arr2[j]) {
	               arr3[k]=arr1[i];
	               k++;
	        	}	
	        }
	     }
		
	   int l=k; k=0;
//	   for( k = 0; k < l; k++) System.out.print(" " + arr3[k]);
	
	   //сортируем итоговый массив общих цифр arr3 (пузырьком)
	   for( i = l-1 ; i > 0 ; i--){
	        for( j = 0 ; j < i ; j++){
	            
	            if( arr3[j] > arr3[j+1] ){ // если последующий за текущим элементом больше,
	                int tmp = arr3[j];	   // через временную переменную - меняем местами
	                arr3[j] = arr3[j+1];
	                arr3[j+1] = tmp;
	            }
	        }
	    }
	   System.out.println();
  
	   for( k = 0; k < l; k++) // Выводим итог без дублей
	     if (arr3[k]!=arr3[k+1]) 
	        System.out.print(" " + arr3[k]);
	   		
	
	}
	   
	}
	
       
