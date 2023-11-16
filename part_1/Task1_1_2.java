package byepam.javaonline.part_1;
/* Задача 1.2 :
 *   Вычислить значение выражения по формуле (все перменные принимают действительные значения):
 *       ( b+Math.sqrt( Math.pow(b,2)+4*a*c ) )/2*a - Math.pow(a,3)*c + Math.pow(b,-2)
 */
import global.Global;
public class Task1_1_2 {
    public static void main(String[] args) {
    	double z=0;
    	double a=Global.InPutFloatVal(" a: "); 				// ввод исходных данных
    	double b=Global.InPutFloatVal(" b: ");
    	double c=Global.InPutFloatVal(" c: ");
       System.out.println("a="+a+"; b="+b+"; c="+c);		//вывод исходных данных
       z=SolveMath(a, b, c);								//вызов фунции для вычисления выражения
       String s ="";
       s= z!=-9999 ? "Вычисления выполнены. z="+z : "Ошибка! ";	//проверяем ошибку:  отрицательное под корнем и ил деление на ноль	
  	   System.out.print(s);									// печать результата
    }

    private static double SolveMath(double a, double b, double c) { //вычисляем выражение
        double rez = 0, rrt=0;
        rrt=Math.pow(b,2)+4*a*c;
        if (rrt<0) {	//проверка подкоренного выражения
            System.out.print("Корень не существует : ");
            return -9999;
        }
         if (a==0){		//проверка деления на ноль
             System.out.print("Деление на ноль : ");
            return -9999;
        }
        rez =  ( b + Math.sqrt(rrt) ) / (2*a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return rez;
    }

    }