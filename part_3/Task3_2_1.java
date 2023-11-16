package byepam.javaonline.part_3;
/* Задача 3.2.1
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task3_2_1 {
	 static String str = "  Prepare to  speak         conf ";	
//-------------------------------------------------------------------	
	static int findSpaces( int cnt ){ // ищем группы пробелов 
		int k=cnt; 
		int sps=0;
		while (k < str.length()) {
			if ( str.codePointAt(k) ==' ') sps++; 
			else 
				break;
			k++;	
		}	
	return sps;	
	}
//--------------------------------------------------------------------	
	public static void main(String[] args) {
	   int i=0;
	   int spcs = 0;
       int maxSps = 0;
       while (i < str.length()) {
	      	if(str.codePointAt(i)==' ') {
	           	  spcs=findSpaces(i);
	           	  i=i+spcs-1;
	           	  if (spcs>maxSps)
	           		  	maxSps=spcs;  
             }
	        i++;
       }
	   System.out.println("Максимум пробелов между слов: "+maxSps);
	}
}
