package byepam.javaonline.part_2;
/* Задача 2.16
 * 	Магическим квадратом порядка  n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, 
 * ...,2n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между 
 * собой. Построить такой квадрат. 
 */
		
public class Task2_2_16 {
	public static int[][] MatrixINT_null(int n) {  
		int[][] mtrx = new int[n][n];
		int i =0;
		int j =0;
		System.out.println("Начальная матрица: ");
		for (i=0;i<=n-1;i++) { 	
			for (j=0;j<=n-1;j++) { 	
			mtrx[i][j]=0;
			}
		}	
		
		System.out.print("№");
		for (i=0;i<=n-1;i++) System.out.print("\t"+(i+1));
		System.out.println();
		for (i=0;i<=n-1;i++) { 	
			System.out.println();
			System.out.print(i+1);
			for (j=0;j<=n-1;j++) { 	
				System.out.print("\t"+mtrx[i][j]);
			}
		}	
	return mtrx;
	}
	
//---------------------------------------------------------------------------------------------	
	static void OddMagic(int n,int array[][]){// Магический квадрат нечетного порядка
		int x=0, y=n/2;
        for(int i=1; i<=n*n; i++){
          	array[x][y]=i;
            x--;                                 			// По очереди заполняем правый верхний угол
            y++;
            if(x<0 && y>n-1) {x=x+2; y=y-1;}     			// Превышение по диагонали
            else if(x<0) x=x+n;                 			// Превышение по верхней границе
            	else if(y>n-1) y=y-n;                		// Превышение по правой границе
            		else if(array[x][y]!=0) {x=x+2; y=y-1;} // Правый верхний угол заполнен
        }
        
    }
	

	
	static void SingleEvenMagic(int n,int array[][])                  // Одиночный магический квадрат
	{
  		int tmp=0;
	    int n0=n/2;
	    OddMagic(n0,array);                            // Разложить магический квадрат на 2 * 2 магических квадрата нечетного порядка, вызвать функцию магического квадрата нечетного порядка для заполнения магического квадрата нечетного порядка в верхнем левом углу
	    for(int i=0; i<n0; i++)
	        for(int j=0; j<n0; j++)
	        {
	        	array[i+n0][j+n0]=array[i][j]+n0*n0;       // Заполняем нечетный магический квадрат в правом нижнем углу
	        	array[i][j+n0]=array[i+n0][j+n0]+n0*n0;     // Заполняем нечетный магический квадрат в правом верхнем углу
	        	array[i+n0][j]=array[i][j+n0]+n0*n0;       // Заполняем нечетный магический квадрат в левом нижнем углу
	        }
	    int k=(n-2)/4;                             // Удовлетворение формуле n = 4 * k + 2
	    for(int i=0; i<n0; i++)
	        for(int j=0; j<k; j++)
	            if(i==n0/2) { // Меняем местами k элементов слева направо в середине магического квадрата в верхнем левом углу с соответствующими элементами в магическом квадрате в нижнем левом углу
	            	tmp=array[i][i+j];
	            	array[i][i+j]=array[i+n0][i+j];
	            	array[i+n0][i+j]=tmp;	
	            }
	            else { // Поменять местами первые k элементов каждой строки верхнего левого магического квадрата, кроме средней строки, с соответствующими элементами в нижнем левом магическом квадрате
	            	tmp=array[i][j];
	            	array[i][j]=array[i+n0][j];
	            	array[i+n0][j]=tmp;
	            }
	    for(int i=0; i<n0; i++)
	        for(int j=n0+n0/2; j>n0+n0/2-(k-1); j--) {  // Меняем местами элементы в столбце k-1 справа налево в среднем столбце магического квадрата в верхнем правом углу с соответствующими элементами в магическом квадрате в правом нижнем углу
	           tmp=array[i][j];
	           array[i][j]=array[i+n0][j];
	           array[i+n0][j]=tmp;
	        }
	     
	}

	static void DoubleEvenMagic(int n,int array[][])                  // Магический квадрат двойного четного порядка
	{
	  
	    for(int i=1, x=0, y=0; i<=n*n; i++)      // Последовательно присваиваем начальные значения
	    {
	    	array[x][y]=i;
	        y++;
	        if(y>n-1) {x++; y-=n;}
	    }
	    for(int i=0; i<n; i++)                   // Разложите магический квадрат на m * m магических квадратов 4-го порядка и замените диагональные элементы каждого магического квадрата 4-го порядка его дополнением
	        for(int j=0; j<n; j++)
	            if(i%4==0 && j%4==0)             // Левая диагональ
	                for(int k=0; k<4; k++)
	                	array[i+k][j+k]=(n*n+1)-array[i+k][j+k];
	            else if(i%4==3 &&j%4==0)         // Правая диагональ
	                for(int k=0; k<4; k++)
	                	array[i-k][j+k]=(n*n+1)-array[i-k][j+k];
	}
	
	static boolean Check(int n,int m[][])
	{
	    int cnt=n*(n*n+1)/2;                                // Сумма каждой строки, столбца и диагонали
	    for(int i=0; i<n; i++)
	    {
	        int sum_row=0,sum_line=0;
	        for(int j=0; j<n; j++)
	            {
	                sum_row+=m[i][j];                       // Проверяем строки
	                sum_line+=m[j][i];                      // Проверяем столбцы
	            }
	        if(sum_row!=cnt || sum_line!=cnt) return false;
	    }
	    int sum_left=0,sum_right=0;
	    for(int i=0; i<n; i++)
	    {
	        sum_left+=m[i][i];                              // Проверяем левую диагональ
	        sum_right+=m[n-i-1][i];                         // Проверяем правильную диагональ
	    }
	    if(sum_left!=cnt || sum_right!=cnt) return false;
	    return true;
	}
	
	static void Printmatrx(int n,int array[][]) {
		System.out.println("\n");
		
		System.out.print("№");
		for (int i=0;i<=n-1;i++) System.out.print("\t"+(i+1));
		System.out.println();
		for (int i=0;i<=n-1;i++) { 	
			System.out.println();
			System.out.print(i+1);
			for (int j=0;j<=n-1;j++) { 	
				System.out.print("\t"+array[i][j]);
			}
		}	
		
		
		
	}
	
	public static void main(String[] args) {
		int n=9;
		int a[][]  = new int [n][n];
		
		a=MatrixINT_null(n); 
		
		
		if (n%2!=0){  // Нечетный порядок
            OddMagic(n,a);
		}
		if (n%2==0){  // Четный порядок одинарной точности 
			SingleEvenMagic(n,a);
		}
		if (n%4==0){  // Четный порядок двойной точности 
			DoubleEvenMagic(n,a);
		}
	
		if (Check(n,a)) {
			Printmatrx(n,a);
		
		}
	}
		
		
}
