package byepam.javaonline.part_2;
/* Задача 4.5
 * 	Составить программу, которая в массиве  A[N] находит второе по величине число (вывести на печать число, 
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task2_4_5 {
	static int[] create_mass_A(int n){
		  int[] ac;
		  ac= new int[n];
		  for (int i=0;i<ac.length;i++) ac[i]=(int) Math.round(Math.random()*17);
		  System.out.print("массив A[N]: ");
		  for (int i=0;i<ac.length;i++) System.out.print("\t "+ac[i]);
		  System.out.println();
		  return ac;
		}
//-----------------------------------------------------------------------------------	
	static int find_max_A(int[] a, int num){
		int maxi=0;
		int maxa=a[0];
		for (int i=0;i<a.length;i++) {
			if( maxa<a[i] && i!=num) { 
					maxi=i;
					maxa=a[i];
			}
		}
	return maxi;
	}
//-----------------------------------------------------------------------------------	
	public static void main(String[] args) {
		int n =5;
		int[] a;
		a= new int[n];
		a=create_mass_A(n);
		int maxi1=find_max_A(a,-1);
		System.out.println("элемент: "+a[maxi1]+"; \tномер: "+maxi1);
		int maxi2=find_max_A(a,maxi1);
		System.out.println("элемент: "+a[maxi2]+"; \tномер: "+maxi2);
	}

}
