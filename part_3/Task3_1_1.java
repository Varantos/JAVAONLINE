package byepam.javaonline.part_3;

/* Задача 3.1.1
 *   Дан массив названий переменных в CamelCase. Преобразовать названия в snake_case. 
 *  ------------------------------------------------------------------------------------ 
 *   CamelCase  (с англ. —  «ВерблюжийРегистр») —  стиль  написания  составных слов, 
 *   при котором несколько слов  пишутся  слитно без пробелов, при этом каждое слово 
 *   внутри фразы пишется с прописной буквы.
 *  ------------------------------------------------------------------------------------ 
 *   Snake case (или snake_case,  рус. змеиный_регистр) —  стиль написания составных  
 *   слов, при котором несколько слов разделяются символом подчеркивания (_), и не имеют  
 *   пробелов в записи, причём каждое слово обычно пишется с маленькой буквы
  */
public class Task3_1_1 {
// Задаем массив
	static String[] inputMasVARS(int n) {
		 String[] s = new String[n];
		 s[0]="CamelOneBoyFridayMonthJuanuary";
		 s[1]="CamelTwoGirlGickBrainsTricks";
		 s[2]="CamelThreeToyPlayMediaGames";
		 s[3]="CamelFourCapDrinkOfCupCofee";
		 s[4]="CamelFivePlateEatManyFood";
	return s;
	};
//---------------------------------------------------------------------------------------	
	static String trans_ONEVAR(String str) {
		int lengstr=str.length();
		int cnt=0;
		int i=0;
		int j=0;
		
		for (i = 1; i < lengstr; i++)  //обработка строкового значения
				if (Character.isUpperCase(str.charAt(i))) cnt++; //считаем количество прописных букв для увелечения с разделителями
		char[] res_snake = new char[lengstr + cnt+1]; // новый массив символов нового строкого значения увеличенного на количество разделителей
		res_snake[0] = Character.toLowerCase(str.charAt(0));// первый символ
		i=1;
		j=1;
		while (i<lengstr) {   
			if (!Character.isUpperCase(str.charAt(i))) {//если заглавная буква не найдена
				 res_snake[j] = Character.toLowerCase(str.charAt(i));j++;
			}
			if (Character.isUpperCase(str.charAt(i))) {//если заглавная буква найдена
				 res_snake[j] = '_';
				 res_snake[j+1] = Character.toLowerCase(str.charAt(i));
				 j=j+2;
			}
			i++;	
		}
	return new String (res_snake);			
	}
//--------------------------------------------------------------------------------------------	
	static String[] transmas_VARS(String s []) {
		String[] snakemas=	new String[5];
		for (int i = 0; i < s.length; i++) //выборка имени переменной из массива
			snakemas[i]=trans_ONEVAR(s[i]);
			return snakemas;
	}
//--------------------------------------------------------
	public static void main(String[] args) {
		int n=5;
		String[] CamelCase=	new String[n];
		String[] snake_case=new String[n];
		CamelCase=	inputMasVARS(n);
		snake_case=	transmas_VARS(CamelCase);
		for (int j = 0; j <snake_case.length; j++) 
			System.out.print(CamelCase[j]+"\t->\t"+snake_case[j]+"\n"); 
	}
}
