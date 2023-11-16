package byepam.javaonline.part_3;
/* Задача 3.2.3
 *  Проверить, является ли заданное слово палиндромом.
 */
public class Task3_2_3 {
	static String str = "!ШАБАШ!";
	public static void main(String[] args) {
		String rvrs = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rvrs)) 
        	System.out.println("Слово: "+str+" :::ПОЛИНДРОМ!"); 
        else 
        	System.out.println("Слово: "+str+" :::НЕ ПОЛИНДРОМ!");
	}
}
