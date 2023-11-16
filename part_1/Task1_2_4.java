package byepam.javaonline.part_1;
/* Задача 2.4 :
 *   Заданы размеры a,b прямоугольного отверстия и размеры x,y,z кирпича.
 *   Определить, пройдет ли кирпич в оверстие.
 */ 
import global.Global;
public class Task1_2_4 {
    public static void main(String[] args) {
        System.out.println("Задача про кирпич!");
        int a=Global.InPutIntVal("Длинна отверстия а: "); 	//Задаем размер отверстия
        int b=Global.InPutIntVal("Ширина отверстия b: ");
        int x=Global.InPutIntVal("Длинна кирпича х: "); 	//Задаем размер кирпича
        int y=Global.InPutIntVal("Длина кирпича  y: ");
        int z=Global.InPutIntVal("Высота кирпича z: ");
        
        System.out.println("Размеры отверстия: a="+a+"; b="+b);			// Выводим размеры отверстия
        System.out.println("Размеры кирпича: x="+x+"; y="+y+"; z="+z);  // Выводим размеры кирпича
      
//проверка условий соответствия размера отверстия размерам кирпича и вывод результата
        if( ((x<=a)&&(y<=b)) || ((x<=b)&&(y<=a)) || ((x<=a)&&(z<=b)) || ((x<=a)&&(z<=b)) || ((z<b)&&(x<a)) ||((y<a)&&(z<b)) || ((z<b)&&(y<a)) ) 
            System.out.print("Кирпич пройдет!");
        else  System.out.print("Кирпич не пройдет!");
    }



}
