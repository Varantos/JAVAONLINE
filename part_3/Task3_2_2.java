package byepam.javaonline.part_3;

/*  Задача 3.2.2
 *   В строке вставить после каждого символа 'a' символ 'b'
 */
public class Task3_2_2 {
	static String str0 = "a  Paaareapare to  spef ak    a aa a     conf ";	
	public static void main(String[] args) {
		 String str1 = str0.replace("a", "ab");
		 System.out.println(str1);
	}

}
