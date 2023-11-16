package byepam.javaonline.part_1;
/* Задача 1.5 :
 *   Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 *   Вывести данное значение длительности в часах,минутах и секундах в следующей форме:
 *   ННч. ММмин. SSсек.
 */
import global.Global;
public class Task1_1_5 {
    public static void main(String[] args) {
        int T=Global.InPutIntVal("Введите время Т в секундах: ");
        System.out.print("Время: "+SolveMath(T));
    }
    private static String SolveMath(int x) {// вычисления времени в часах минутах и секундах
        int sec	=0;
        int mins=0;
        int hrs	=0;
        String ssec ="";
        String smins="";
        String shrs ="";
        String Srez ="";
        hrs =x/3600; 	// количество часов
        mins=(x/60)%60;	// количество минут
        sec =x%60;		// количество секунд
        if (hrs <10) {  shrs=  "0"+Integer.toString(hrs); } else shrs=Integer.toString(hrs);	//формируем результат
        if (mins<10) {  smins= "0"+Integer.toString(mins);} else smins=Integer.toString(mins);
        if (sec <10) {  ssec=  "0"+Integer.toString(sec); } else ssec=Integer.toString(sec);
        Srez=shrs+"ч. "+smins+"мин. "+ssec+"сек. ";// формироуем строковое форматированное значение времени
        return Srez;
    }
}
