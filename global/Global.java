package global;
import java.util.Locale;
import java.util.Scanner;
// глобальные определения для решения задач
public class Global {
//------------------------------------------------------------	
//ввод вещественного числа float
public static float InPutFloatVal(String msg) { 
	float val=0; 
	try(Scanner scanIn = new Scanner(System.in)){
		scanIn.useLocale(Locale.getDefault());      
		do{
		    System.out.print(msg);
		    if (scanIn.hasNextFloat()) {
		        val = scanIn.nextFloat();
		        break;
		    } else scanIn.next();
		}while (true);
    }
	return val;
		
}
//------------------------------------------------------------
//ввод вещественного числа  int
public static int InPutIntVal(String msg) {   
	int val = 0;  
	try (Scanner scanIn = new Scanner(System.in))
	{
		scanIn.useLocale(Locale.getDefault());    
		do {
		    System.out.print(msg);
		    if (scanIn.hasNextInt()) {
		        val = scanIn.nextInt();
		        break;
		    } else scanIn.next();
		} while (true);
   }
	return val;
    }
//------------------------------------------------------------
// ввод массива координат из двух чисел типа int
public static int[] InPutCrds(String msg) { 	
	int[] crds;
	crds= new int[2];
	try(Scanner scanIn = new Scanner(System.in)){
	   scanIn.useLocale(Locale.getDefault());    
	   System.out.print(msg);
	   crds[0] = scanIn.nextInt();
	   crds[1] = scanIn.nextInt();
   }
	return crds;
}
//------------------------------------------------------------ 
//заполняем массив-вектор случайными вещественными значениями [0; 40]
public static int[] GenVectorInt_rnd(int n) { 
	int[] vector = new int[n];
	int cnt	= 0;
	System.out.println("Начальный массив: ");
	for (cnt=0;cnt<=n-1;cnt++) { 		
		vector[cnt]=(int) Math.round(Math.random()*40);
		System.out.print("\t"+vector[cnt]);
	}
	return vector;
}
//-------------------------------------------------------------------
//заполняем массив-вектор случайными вещественными значениями [-40; 40]
public static double[] GenVectorDbl_rnd(int n) {  
	double[] vector = new double[n];
	int cnt		 =0;
	System.out.println("Начальный массив: ");
	for (cnt=0;cnt<=n-1;cnt++) { 		
		vector[cnt]= (Math.random()*41)-20;
		System.out.printf("%.2f\t", vector[cnt]);
	}
	return vector;
}




//-------------------------------------------------------------------
//заполняем массив-матрицу случайными целыми значениями [0; 40]
public static int[][] GenMatrixINT_rnd(int n, int m) {  
	int[][] mtrx = new int[n][m];
	int i =0;
	int j =0;
	System.out.println("Начальная матрица: ");
	for (i=0;i<=n-1;i++) { 	
		for (j=0;j<=m-1;j++) { 	
		mtrx[i][j]=(int) Math.round(Math.random()*40);
		}
	}	
	
	System.out.print("№");
	for (i=0;i<=m-1;i++) System.out.print("\t"+i);
	System.out.println();
	for (i=0;i<=n-1;i++) { 	
		System.out.println();
		System.out.print(i);
		for (j=0;j<=m-1;j++) { 	
			System.out.print("\t"+mtrx[i][j]);
		}
	}	
	
	
	
	return mtrx;
}

//-------------------------------------------------------------------
//заполняем массив-матрицу случайными дробными значениями [0; 40]
public static double[][] GenMatrixDbl_rnd(int n, int m) {  
	double[][] mtrx = new double[n][m];
	int i =0;
	int j =0;
	System.out.println("Начальная матрица: ");
	for (i=0;i<=n-1;i++) { 	
		for (j=0;j<=m-1;j++) { 	
		mtrx[i][j]= (Math.random()*41)-20;
		}
	}	
	
//	System.out.print("№");
//	for (i=0;i<=m-1;i++) System.out.print("\t"+i);
//	System.out.println();
	for (i=0;i<=n-1;i++) { 	
		System.out.println();
	//	System.out.print(i);
		for (j=0;j<=m-1;j++) { 	
			System.out.printf("%.2f\t", mtrx[i][j]);
		}
	}	
	
	
	
	return mtrx;
}

}
//----------------------------------------------------------------------------------
/*public void readShapeData() throws IOException {
    Scanner in = new Scanner(System.in);
    try {
        System.out.println("Enter the width of the Rectangle: ");
        width = in.nextDouble();
        System.out.println("Enter the height of the Rectangle: ");
        height = in.nextDouble();
    } finally {
        in.close();
    }
}
 * ---------
 * try (Scanner in = new Scanner(System.in)) {
    ... 
}
 */


