package byepam.javaonline.part_2;

/*	Задача 3.8
 * СУММА СЛУЧАЙНЫХ ОБЫКНОВЕННЫХ ДРОБЕЙ 
  */
public class Task2_3_8_sum {
	public static void main(String[] args) {
		String str=""; 
		int n=5;
		int i=0;			
		int  dbl_fracs[][] = new int[n][2];		 
		int  rs2_fracs[] = new int[2];
		//заполняем массив объектов типа дробь случайными значениями
		for ( i=0; i<dbl_fracs.length; i++) {
			int x=1+(int) Math.round(Math.random()*7);
			int y=1+(int) Math.round(Math.random()*7);
			dbl_fracs[i][0]=x;
			dbl_fracs[i][1]=y;
			str=str+dbl_fracs[i][0] + "/" + dbl_fracs[i][1]+"  ";
		};	
		System.out.println(str);
		rs2_fracs[0]=dbl_fracs[0][0];//первая дробь
		rs2_fracs[1]=dbl_fracs[0][1];
		//-----------------------------------------------------
		for ( i=1; i<dbl_fracs.length; i++)  //сложение дробей
		rs2_fracs=dblsum(rs2_fracs[0],rs2_fracs[1],dbl_fracs[i][0],dbl_fracs[i][1]);
	    System.out.println("(НеСКР) = " +rs2_fracs[0] + "/"+rs2_fracs[1]);
		System.out.println("(СУММА) = " +asFraction(rs2_fracs[0],rs2_fracs[1]));//сокращаем дробь 
	}
	public static int[]  dblsum(int nom1, int denom1, int nom2,int denom2) {
		int  rez[] = new int[2];
		int comd =  denom1 * denom2;
		int answer = nom1*denom2 + nom2*denom1;
		rez[0]=answer;
 	 	rez[1]=comd;
 	 	return rez;
	}
	
public static int NOD(int a, int b) {
    return b == 0 ? a : NOD(b, a % b);
}

static int NOK(int n1, int n2) 
	{ 
	  return n1*n2 / NOD(n1, n2); 
	}

public static String asFraction(int a, int b) {
    int gcd = NOD(a, b);
    return (a / gcd) + "/" + (b / gcd);
}
	
}
