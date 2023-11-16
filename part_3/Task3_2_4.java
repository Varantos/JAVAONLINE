package byepam.javaonline.part_3;
/* Задача 3.2.4.
 * С помощью функции копирования и операции конкатенации 
 * составить из частей слова “информатика” слово “торт”.
 */
public class Task3_2_4 {
	static String str = "ИНФОРМАТИКА";
	public static void main(String[] args) {
		String T	= str.substring(7, 8);
		String OP	= str.substring(3, 5);
        System.out.println(T+OP+T);
	}
}
