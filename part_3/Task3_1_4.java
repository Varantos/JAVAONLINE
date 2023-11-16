package byepam.javaonline.part_3;

/* Задача 3.1.4
 * В строке найти количество чисел. 
 */
public class Task3_1_4 {
	public static char[] NUMBERS="1234567890".toCharArray();
	
	static int findNUM( int cnt, char[] str ){ // ищем группы цифр 
		int k=cnt; 
		int dgds=0;
		while (k < str.length) {
			if ( Character.isDigit(str[k]) ) dgds++;
			if (str[k]=='.' ) dgds++ ;
			if (Character.isDigit(str[k+1])) dgds++; 
				else break;
			k++;	
		}	
	return dgds;	
	}
	
	public static void main(String[] args) {
		char[] str = "w222.99ordfkwor77.7kgjdflkwo w.rdvg32vwewe word  ogwo-888rk".toCharArray();
		int nums=0;
		int j=0;
		int i=0;
		while (i < str.length) {
			if(  Character.isDigit(str[i]) ) { //Найдена цифра!
				nums=findNUM(i,str);	// считаем цифры в найденом числе
				i=i+nums; 				// сдвигаемся на количество цифр в исходной строке
				j++;					// счетчик чисел увеличиваем
			};
			i++; 						//переход на следующий символ строки после найденного числа
			}
		System.out.println("Строка: "+new String(str));
			System.out.println("Чисел в строке: "+j);
	}
}