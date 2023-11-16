package byepam.javaonline.part_2;

/*Задача 3.7
 * Найти НОД 4х натуральных чисел.
 */
public class Task2_4_2 {
	public static void main(String[] args) {
		int i=0;
		int[] nums = new int[4];
		int nod1, nod2;
		nums[0]=12;		nums[1]=18;		nums[2]=46;		nums[3]=82;
		
	 for(i=0;i<4;i++) {
		// nums[i]=(int) Math.round(Math.random()*40);
		 System.out.print(nums[i]+"\t");
	 }

	 nod1=gcd( nums[0],nums[1]);System.out.print("\n НОД1="+nod1+"; ");
	 nod2=gcd( nums[2],nums[3]);System.out.println(" НОД2="+nod2);
	
	 gcd( nod2, nod1 );
	
	 System.out.println(" НОД= "+gcd( nod2, nod1 ));
	 
	}
	
	
	public static int gcd(int a, int b) { 
		if (b==0) return a; //если число доделено до нуля - выход
		   return gcd(b,a%b);//делим и возвращаем последующий результат
		}
	
	
}
