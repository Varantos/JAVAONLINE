package byepam.javaonline.part_1;
/* «адача 1.6 :
 *   ƒл€ данной области составить линейную программу, котора€ печатает "true", если 
 *   точка скоординатами принадлежит закрашенной области, и "false" - в противном случае.
 *  
 */  
import global.Global;
public class Task1_1_6 {
    public static void main(String[] args) {
    	boolean flag=false;
    	int x=0;
    	int y=0;
    	x=Global.InPutIntVal("¬ведите координату X: ");
        y=Global.InPutIntVal("введите координату Y: ");
        if (y>=0 & y<=4) {						//определение границ области
            if (x>=-2 & x<=2)  flag=true;	 	//задание флага принадлежности
        }
        if (y>=-3 & y<=0) {						//определение границ области
            if (x>=-4 & x<=4)  flag=true; 		//задание флага принадлежности
        }
        if (x==0 & y==-1) {flag=false;} 		//исключаема€ точка из области????
        if (flag==true) System.out.print("(TRUE) “очка ("+x+","+y+") принадлежит закрашенной области.");
            else System.out.print("(FALSE) “очка ("+x+","+y+") не принадлежит закрашенной области.");
    }
}

