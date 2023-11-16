package byepam.javaonline.part_3;
/* Задача 3.2.10
 *  Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
 *  восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */
public class Task3_2_10 {
	static String x ="Mirror, mirror, on the wall,"
			+ "Who is the fairest of us all? "
			+ "Queen, Queen, on thy throne,"
			+ "Snow White's the fairest thou must own. "
			+ "Somebody is sleeping in my bed, just look how beautiful she is!";
	
	public static void main(String[] args) {
		int cnt=0;
		int i=0;
		while(i<x.length() ) {
			if ( (x.charAt(i)=='.')||(x.charAt(i)=='!')||(x.charAt(i)=='?') ) cnt++;
			i++;
		}
		System.out.println("Sentences: "+cnt);
	}
}
