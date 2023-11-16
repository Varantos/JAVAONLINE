package byepam.javaonline.part_2;

import java.util.Locale;
import java.util.Scanner;

/* Задача 4.9
* 	Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
* Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
* 
* (Теорема Пифагора + Формула Герона).
* Формула Герона для произвольного треугольника pl_tr:=sqrt(p*(p-x)*(p-y)*(p-z)); 
* S четвырехугольника = S прямоуг. треугольника +(-) S произв. треугольника. Все стороны известны.
* Для выпуклого - складываем площади. Для вогнутого - вычитаем площади.
*/
public class Task2_4_9 {
	
	static double[] In_IntVal(int n) { //ввод массива сторон  x,y,z,t
		int i=0;
		double []val;  
		val = new double [n];
		try(Scanner scanner = new Scanner(System.in)){
			scanner.useLocale(Locale.getDefault());
			do {
				System.out.print(" :: "+(i+1)+": ");
				    if (scanner.hasNextFloat()) {
				        val[i] = scanner.nextFloat();
				        i++;
					    if (i==n) break;
					}   else scanner.next();	
			} while (true);
		}// try
		 catch (Exception e) {
	           e.printStackTrace();
	       } //отлов исключения    
		return val;
	}

	static double diag(double x, double y) {				// теорема Пифагора (диагональ-гипотенуза)
		return  Math.sqrt(x*x+y*y);
	}

	static double half_per(double t1, double t2,double t3) {// Полупериметр треугольника
		return (t1+t2+t3)/2 ;
	}
	static double pl1(double x1, double y1) { 				// площадь прямоугольного треугольника
		return (x1+y1*0.5)/2 ;
	}
	
	static double pl2(double[]vershs) { 					// площадь произвольного треугольника по трем сторонам(формула Герона) 
		double x=	vershs[0];
		double y=	vershs[1];
		double z=	vershs[2];
		double t=	vershs[3];
		double d = diag(x,y);				//диагональ
		double p = half_per(z,t,d); 		//полупериметр
		return Math.sqrt(p*(p-z)*(p-t)*(p-d)); 
	}
	
	static double pl(double pl1, double pl2) {
		return pl1+pl2;
	}
	
public static void main(String[] args) {
		System.out.println("введите стороны:");
		double [] vershs=new double [3];
		vershs=In_IntVal(4);	
		System.out.printf("Площадь фигуры: %.2f",pl(pl1(vershs[0],vershs[1]),pl2(vershs)));
	}
	
}

