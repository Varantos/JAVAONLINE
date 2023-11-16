package byepam.javaonline.part_2;

import global.Global;

/* Задача 3.6
* 	 СОРТИРОВКА ШЕЛЛА
*		Дан  массив  n  действительных  чисел.  
*		Требуется  упорядочить  его  по  возрастанию. 
*		Делается это следующим образом: 
* 			сравниваются два соседних элемента a(i) и a(i+1);
* 			если  a(i)<=a(i+1), то продвигаются на  один  элемент  вперед;  
* 			если a(i)>a(i+1),  то  производится  перестановка  и  сдвигаются  на  один  элемент  назад;
*			cоставить алгоритм этой сортировки.
*/
public class Task2_3_6 {
	public static void main(String[] args) {
		int n=10;
		int i=0;		
		
		int[] a = new int[n];			 // создаем и заполняем первый массив
		a = Global.GenVectorInt_rnd(n);  //заполняем и выводим массив вконсоль
		ShellSort( n,  a);
		
		System.out.println("\n");
		System.out.print("ОТСОРТИРОВАНО! АЛГОРИТМ ШЕЛЛА:\n");
		for (i=0;i<=a.length-1;i++) System.out.print("\t"+a[i]);
	
	}

//------------------------------------------------------	
	static void ShellSort(int n, int a[]){
	    int i, j, step;
	    int tmp;
	    for (step = n/2; step>0; step/=2)
	        for (i = step; i<n; i++){
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
//------------------------------------------------------	
	
}
