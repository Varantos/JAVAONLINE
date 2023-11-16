package byepam.javaonline.part_1;
/* «адача 1.4 :
 *   ƒано вещественное число R вида nnn.ddd(три цифровых разр€да в дробной и целой част€х).
 *   ѕомен€ть дробную и целую части числа местами и вывести полученное значение числа. 
 */
import global.Global;
public class Task1_1_4 {
    public static void main(String[] args) {
       float  ValueX;
       ValueX=Global.InPutFloatVal("¬ведите вещественное число вида nnn.xxx: ");
       System.out.print( "REZ="+SolveMath(ValueX)  ); // вывод результата
    }
    private static double SolveMath(float x) {
        return (int)x*0.001 + Math.round( ( ( x-(int)x)*1000 ) ); // поменч€ли местами дробную и целую части числа
    }

}
