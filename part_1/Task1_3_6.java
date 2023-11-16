package byepam.javaonline.part_1;
/* Задача 3.6 :
 *   Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task1_3_6 { //UTF-8 ???
    public static void main(String[] args) {
    	 // "ISO-8859-1" - западноевропейские языки
        // "windows-1251" - стандартная Windows (русская)
        // "UTF-8" - юникод !!!
    	// ASCII - ????
        String systemEncoding = "windows-1251";
        
        for (char c='а'; c<='я'; c++) System.out.println("Код="+(int)c+"  Символ="+c); //РїСЂРѕРїРёСЃРЅС‹Рµ
        
        System.out.println();
        
        for (char c='А'; c<='Я'; c++) System.out.println("Код= "+(int)c+"  Символ= "+c); //СЃС‚СЂРѕС‡РЅС‹Рµ
  
    }
}
//=================================================================================================
