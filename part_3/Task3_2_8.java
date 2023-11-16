package byepam.javaonline.part_3;
/*  Задача 3.2.8
 *  Вводится строка слов, разделенных пробелами. 
 *  Найти самое длинное слово и вывести его на экран. 
 *  Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
public class Task3_2_8 {
	static String str = "Трипс трапс трулль восемь дырок пять кастрюль";
	public static void main(String[] args) {
		int curlen=0;
		int maxlen=0;
		int index=0;
		String[] wordMass=str.split(" ");
		maxlen=wordMass[0].length();
		for (int i=0; i<wordMass.length; i++ ) {
			curlen=wordMass[i].length();
			if (maxlen<curlen) {
				maxlen=curlen;
				index=i;
			};
		}
		System.out.println("maxSymbols: "+maxlen+", word: "+wordMass[index]);
	} 
	
}
