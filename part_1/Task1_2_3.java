package byepam.javaonline.part_1;
/* Задача 2.3 :
 *   Даны три точки A(x1,y1), B(x2,y2), C(x3,y3). Определить, будут ли они расположены на одной прямой.
 */ 
import global.Global;
public class Task1_2_3 {
    public static void main(String[] args) {
        System.out.println("принадлежат ли точки одной прямой? вводите координаты через пробел.");
        if (SolveMath( Global.InPutCrds("Точка А: "), Global.InPutCrds("Точка B: "), Global.InPutCrds("Точка C: ") )==0)
            System.out.print("Принадлежат одной прямой!");
                else System.out.print(" Не принадлежат одной прямой.");
    }
    private static int SolveMath(int[] pnt1, int[] pnt2, int[] pnt3) { 
        System.out.print("Точки A("+pnt1[0]+","+pnt1[1]+"); B("+pnt2[0]+","+pnt2[1]+"); C("+pnt3[0]+","+pnt3[1]+")");
        return  (pnt1[0]-pnt3[0])*(pnt2[1]-pnt3[1])-(pnt2[0]-pnt3[0])*(pnt1[1]-pnt3[1]); //правило принадлежности трех точек одной прямой
    }

}
