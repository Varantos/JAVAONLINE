package byepam.javaonline.part_3;

import java.util.Scanner;

/*  Задача 3.2.7
 *  Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 *  Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class Task3_2_7 {
	static String str = "  АБРАКАДАБРА    МАБРАВАКАДРА АВАДАКЕДАВРА АЛОХОМОРА ГОМЕНУМ РЕВОЛИО  ";
	public static void main(String[] args) {
		int i=0;
		int j=0;
		System.out.println("Init  : "+str);	
		
//		Scanner inSC = new Scanner(System.in).useDelimiter("\n");
//        String str = inSC.next();
		
		// удаляем все пробелы и приравненые к ним символы
		StringBuilder strBldr = new StringBuilder(str.replaceAll("\\s", ""));
		// удаляем все дубли символов	
		for (i=0;i<strBldr.length();i++) {
				for (j=i+1;j<strBldr.length();j++) {
					if ( strBldr.charAt(i)==strBldr.charAt(j) ) { 
						strBldr.deleteCharAt(j);
						j--;
					}
				}
		}
		System.out.println("Result: "+strBldr);	
	
//----------------------------------------------
//		System.out.println("\n->"+str);	
//		String pattern = "(.)(?=(.*))(?<=(?=\\1.*?\\1\\2$).+)";//регулярка
//		String result = str.replaceAll("\\s", "").replaceAll(pattern, "");
//		System.out.println("->"+result);
	}
}
