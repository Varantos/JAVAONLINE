package byepam.javaonline.part_1;
/* Задача 1.1 :
 *   Найдите значение функции z=((a-3)*b/2)+с
 */
import global.Global;
public class Task1_1_1 {

	
    public static void main(String[] args) {
        float a=0;
        float b=0;
        float c=0;
        a=Global.InPutFloatVal(" a: "); 
        b=Global.InPutFloatVal(" b: ");
        c=Global.InPutFloatVal(" c: ");
        System.out.println("a="+a+"; b="+b+"; c="+c);   
        System.out.println("z= "+SolveMath(a, b, c) ); 
    }
//вычисляем функцию
    private static float SolveMath(float a, float b, float c) {  
        float rez=0;
        rez=((a-3)*b/2)+c;
        return rez;
    }




}
