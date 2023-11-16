package byepam.javaonline.part_1;
/* Задача 2.1 :
 *   Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
 *   если да, то будет ли он прямоугольным?
*/  
import global.Global;
public class Task1_2_1 {
     public static void main(String[] args) {
      int Corner1=Global.InPutIntVal("Угол 1 треугольника(в градусах): ");
      int Corner2=Global.InPutIntVal("Угол 2 треугольника(в градусах): ");

      //Сумма углов любого треугольника равна 180 градусов
       if ( (Corner1+Corner2) <=180 )
            System.out.println("Можно построить треугольник!"); 
            else System.out.println("Не получится треугольник.");

       if ( (180-(Corner1+Corner2))==90 )
            System.out.println("Будет прямоугольный треугольник!"); 
        	else System.out.println("Не получится прямоугольный треугольник.");

      }
}


