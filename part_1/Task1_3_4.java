package byepam.javaonline.part_1;
/* Задача 3.4 :
 *   Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
import java.math.BigInteger;
public class Task1_3_4 {
    public static void main(String[] args) {
// Для решения задачи используем тип BigIntreger.
// Так как нам не хватает размера даже Long.
// Все используемые переменные делаем одного типа.
    	
    	BigInteger rez   = new BigInteger("1"); // инициализируем переменные типа BigInteger со значением 1.
        BigInteger kvadr = new BigInteger("1");
        BigInteger count = new BigInteger("1");
        BigInteger stp   = new BigInteger("1");
        int n=200; 						   // количество чисел, учавствующих в подсчете
        
        while (count.longValue() <= n) {   // пока не достигнуто конечное значение n=200, цикл
            kvadr = count.multiply(count); // вычисление квадрата числа
            rez   = rez.multiply(kvadr);   // вычисление произведения
            System.out.println("rez_kv="+kvadr.toString()+" rez="+rez.toString()+" cnt="+count.toString()); // контроль результата 
            count=count.add(stp) ;		   // увеличение шага
        }
        System.out.println("Произведение квадратов первых "+n+" целых чисел: "+ rez); //вывод итогового знаячения
    }
}
