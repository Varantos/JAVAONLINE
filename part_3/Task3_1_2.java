package byepam.javaonline.part_3;

/*	«адача 3.1.2
 *	«амените в строке все вхождени€ 'word' на 'letter'.
 */
public class Task3_1_2 {
   	public static char[] CHR_WORD 	= "word".toCharArray();
    public static char[] CHR_LETTER	= "LETTER".toCharArray();
//--------------------------------------------------------------------------------------------------------------------
	static boolean findWord( int cnt, char[] strwrd, char [] word ){ // сравнить 4 символа, нач€нина€ с i-го на "WORD" 
		boolean flg=false;
		int k=0; 
		while (k < word.length) { 
		 if ( strwrd[cnt+k]==word[k] ) flg=true;
		 	else {flg= false; break;};
		 k++;
		}
	return flg;	
	}
//--------------------------------------------------------------------------------------------------------------------	
	static int CntWords( char[] strk) {
		int count=0;
		for (int i=0;i< strk.length;i++) 
			if (strk[i]== CHR_WORD[0] )
				if  ( findWord(i, strk, CHR_WORD ) ) 
					count++;
	return count;
	}
//--------------------------------------------------------------------------------------------------------------------	
	static char[] insletter( char[] strk, char[] str_wrd, char [] str_letter ) {
	   	int i		=0;// счетчик дл€ начальной строки
    	int j		=0;// счетчик дл€ итоговой строки
    	int cnt_le	=0; //счетчик дл€ LETTER
  
    	int	len=strk.length+ CntWords(strk)*(str_letter.length-str_wrd.length+1);//размер массива увеличиваем на недостоющие символы
    	char[] strk1=new char [len ];  //новый массив с замененным словом
		for (i=0;i< strk.length;i++) { // цикл по исходной строке
    		if (strk[i]!= str_wrd[0] )  strk1[j]=strk[i];//если не  перва€ буква замен€емого слова, то оставл€ем как ксть
    		if (strk[i]== str_wrd[0] )   {				 // если перва€ буква искомого слова, то ...
    			strk1[j]=strk[i];						 // букву оставл€ем и...
    			if  ( findWord(i, strk, str_wrd) ) {	 // проваер€ем на все слово целиком
      				cnt_le=0;							//  если наше слово, то пишем слово, иначе переход хода дальше. 
      				i=i+str_wrd.length-1;
      				while (cnt_le < str_letter.length) {
      					strk1[j]=str_letter[cnt_le];
      					cnt_le++;j++;
      				}
     			}
    		}
   			j++;	
    	} 
		return strk1;
	}
//--------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        char[] strk = "wordfkworkgjdflkwo wordvgvwewe word  lgfflkg wordkvmkjnogwork".toCharArray();
    	System.out.println(" «аменить в строке все вхождени€ 'word' на 'letter:':\n Ќачалальна€ нстрока: "+ new String(strk));
       	System.out.println(" »тогова€ строка: "+ new String( insletter(  strk,  CHR_WORD, CHR_LETTER ) ));	
    }//Main method
 }/////Main  Task3_1_2
