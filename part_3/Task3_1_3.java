package byepam.javaonline.part_3;

/*	Задача 3.1.3
 * В строке найти количество цифр.
 */
public class Task3_1_3 {
//--------------------------------------------------------------------------------------------------------------------
	static int findNumber(char[] str ){ // поиск цифр 
		char[] numbers="1234567890".toCharArray();
		int i=0; 
		int j=0;
		int cnt=0;
		while (i < str.length) { 
			for (j=0;j<numbers.length;j++) {
				if ( str[i]==numbers[j] )
			 		cnt++;
			}
			i++;
		}
	return cnt;	
	}
//--------------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		char[] strk = "wordfkwork6gjdflkwo 6wordv67gvwewe word  lgf754flkg wordkvmkjnogwork".toCharArray();
		System.out.println(" Строка: "+new String(strk) +"\n Количество цифр: "+findNumber(strk ));
		 
	 }
}
