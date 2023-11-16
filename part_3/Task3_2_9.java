package byepam.javaonline.part_3;
/* Задача 3.2.9
 *  Посчитать количество строчных (маленьких) и прописных (больших) 
 *  букв в введенной строке. Учитывать только английские буквы.
 */
public class Task3_2_9 {
	static String str = "You can’t make aN omELet wiThout breAking a few eGgs.";
	public static void main(String[] args) {
		int lower=0;
		int upper=0;
		for (int i=0;i<str.length();i++) {
			if( Character.isLowerCase(str.charAt(i)) ) lower++;
			if( Character.isUpperCase(str.charAt(i)) ) upper++;
		}
		System.out.println("lower case: "+lower);
		System.out.println("upper case: "+upper);
	}
}