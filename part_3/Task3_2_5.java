package byepam.javaonline.part_3;
/*  Задача 3.2.5
 *Подсчитать, сколько раз среди символов заданной строки встречается буква “а”. 
 */
public class Task3_2_5 {
	static char s_a = 'a';
	static char s_A = 'A';
	static String str = "Police sAid the two had conducted unnecessary activities Э"
			+ "when they should have been in home isolation. They both later tested"
			+ "positive for the fast-spreading OmicrAn variAnt.";
	public static void main(String[] args) {
		int cntA=0;
		int i=0;
		for (i=0; i<str.length(); i++ ) 
			if ( (str.charAt(i)==s_a)||(str.charAt(i)==s_A) ) cntA++;
		System.out.println("Number of ("+s_a+"&A"+"): "+cntA);
	}

}
