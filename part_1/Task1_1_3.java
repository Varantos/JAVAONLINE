package byepam.javaonline.part_1;

import global.Global;

/* Задача 1.3 :
 *   Вычислить значение выражения по формуле (все перменные принимают действительные значения):
 *           ( ( sin(x)+cos(x) )/ (cos(x)-sin(x) ) ) *tg(x)
 */
public class Task1_1_3 {
    public static void main(String[] args) {
        double x=Global.InPutFloatVal(" x: ");		//ввод исходных данных
        double y=Global.InPutFloatVal(" y: ");
        System.out.println("x="+x+"; y="+y);		//печать исходных данных
        System.out.println("z= "+SolveMath(x,y) );	//вызов функции вычисления и вывод результата
    }
    
    private static double SolveMath(double x, double y) {
    	double r1 =0;
    	double r2 =0;
    	double res=0;
        r1=Math.sin(x)+Math.cos(y);			// числитель
        r2=Math.cos(x)-Math.sin(y);			// знаменатель
        if (r2!=0) {						// проверка знаменателя на ноль
            res = (r1/r2) * Math.tan(x*y);  // выражение
        }else System.out.println("Деление на ноль!");
        return res;
    }


}
