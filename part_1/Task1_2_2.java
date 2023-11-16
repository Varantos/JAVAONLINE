package byepam.javaonline.part_1;
/* Задача 2.2 :
 *   Найти max{ min(a,b), min(c,d) } 
 */  
import global.Global;
public class Task1_2_2 {
    public static void main(String[] args) {
        int a = Global.InPutIntVal(" Р°: "); 					// ввод исходных данных
        int b = Global.InPutIntVal(" b: ");
        int c = Global.InPutIntVal(" c: ");
        int d = Global.InPutIntVal(" d: ");
        
        System.out.println("a="+a+"; b="+b+"; c="+c+"; d="+d);	// печать исходных данных
        
        if (b<a) {			// min(a,b)
            a = b;
        } else if (a==b) System.out.print("(equal):: ");
        System.out.println("min(a,d)="+a);
       
        if (c>d) {			//min(c,d)
            c = d;
        } else if (c==d) System.out.print("(equal):: ");
        System.out.println("min(c,d)="+c);
        
        if (c>a) {			//max{ min(a,b), min(c,d)
            a = c;
        } else if (c==a) System.out.print("(equal):: ");
        System.out.println("max(min(a,b),min(c,d))="+a);
     }

}
