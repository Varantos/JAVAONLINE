package byepam.javaonline.part_2;
/* Задача 4.7
 *	Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 **/
public class Task2_4_7 {

	static int Factorial(int n){
		int fct=1;
		for (int i=1;i<=n;i++) fct=fct*i;
		return fct;
	}

	static void Fact_Necht(int n){
		for (int i=1;i<=n;i++) 
			if(i%2!=0) System.out.println("Число: "+i+" Факториал: "+Factorial(i));
		
	}
	
	public static void main(String[] args) {
		int n=9;
		Fact_Necht(n);
		
	}
	
}


