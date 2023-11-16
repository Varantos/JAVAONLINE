package byepam.javaonline.part_1;
/* Задача 3.5 :
*    Даны числовой ряд и некоторе число Е. Найти сумму тех членов ряда, модуль которых
*    больше или равен заданному Е. общий вид член ряда имеет вид:
*   												a=1/Math.pow(2,n)+1/Math.pow(3,n) 
*/
import global.Global;
public class Task1_3_5 {
    public static void main(String[] args) {
        int 	i=0;
        double	n=0;
        double	e=0;
        double	a=0;
        double	sum=0;
        n=Global.InPutFloatVal("Введите предел числового ряда n: ");
        e=Global.InPutFloatVal("введите число е: ");
         
        while (i<=n){							// пока i <=n
            a=1/Math.pow(2,i)+1/Math.pow(3,i);	// вычисляем член ряда
            if (Math.abs(a)>=e) sum=sum+a;		// если модуль выажения больше либо равное - суммируем
            i++;								// увеличиваем счетчик i
        }
        System.out.println("Сумма: "+sum);		// вывод на экрас полученной суммы
    }


}
