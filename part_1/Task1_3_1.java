package byepam.javaonline.part_1;
/* Задача 3.1 :
 *   Напишите програму, где пользователь вводит любое число.
 *   Программа суммирует все числа от 1 до введенного пользователем числа.
 */
import global.Global;
public class Task1_3_1 {
    public static void main(String[] args) {
    	int x	=0;
    	int i	=1;
    	int rez	=0;
        x=Global.InPutIntVal("Введите любое число: ");
        if (x>0)
        	for(i=0;i<=x;i++) 
         	rez+=i;
        System.out.println("Сумма  чисел : rez="+ rez);
    }
}
