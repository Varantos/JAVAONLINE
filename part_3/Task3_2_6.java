package byepam.javaonline.part_3;
/* Задача 3.2.6
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task3_2_6 {
	static String str = " АБРА КА ДАБРА  МАБРЕ АВА КАДРА ";
	
	public static void main(String[] args) {
		StringBuilder strBldr = new StringBuilder(str);
		String kk="";
		for (int i=0;i<strBldr.length();i++) {
			kk=String.valueOf( strBldr.charAt(i) )+String.valueOf( strBldr.charAt(i) );
			strBldr.replace(i, i+1, String.valueOf(kk));	
			i++;
		}
		System.out.println(strBldr);	
	}
	
}
