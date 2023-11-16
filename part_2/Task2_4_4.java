package byepam.javaonline.part_2;
/* Задача 4.4
* 	На плоскости заданы своими координатами  n  точек.  Написать метод(методы), определяющие, между какими
* из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.	 
*/
import java.lang.Math;
public class Task2_4_4 {
	public static int n=5;
	public static int m=2;
//-----------------------------------------------------------------------------------
	static double dista(int x0,int y0,int x1,int y1){
		 return (double)Math.sqrt(Math.pow(x1-x0,2)+Math.pow(y1-y0,2));
		}	
//-----------------------------------------------------------------------------------	
	static String find_max(int[][] point){
		int i=0;
		int j=0;
		double dist=0;
		int ii0=0;
		int jj1=0;
		double pmax=dista(point[0][0],point[0][1],point[1][0],point[1][1]);//(x0,y0)  (x1,y1)
		for (i =1; i < n-1; i++){
	        for (j =i+1; j < n; j++){
	        	dist=dista(point[i][0],point[i][1],point[j][0],point[j][1]);
	        	if (dist>pmax) {
	        		pmax=dist;   	
	        	    ii0=i;
	        		jj1=j;
	        	}
	        }
	     }
		return "\n Максимальное:"+pmax+"; \n"+" Точки: ("+point[ii0][0]+", "+point[ii0][1]+"), ("+point[jj1][0]+", "+point[jj1][1]+")." ;
		}
//-----------------------------------------------------------------------------------
	static int[][] CreateMass(int n, int m){
	  int[][] pointC;
	  pointC= new int[n][m];
	  for (int i=0;i<n;i++) {
		  for (int j=0;j<m;j++) {
				pointC[i][j]=(int) Math.round(Math.random()*10);
		  }
	  }
	  for (int i=0;i<n;i++) System.out.print("\t ("+pointC[i][0]+","+pointC[i][1]+")");
	  return pointC;
	}
//-----------------------------------------------------------------------------------	
	public static void main(String[] args) {
		int[][] point;
		point= new int[n][m];
		point=CreateMass(n, m);
		System.out.println( find_max(point) );
	}
}
