package byepam.javaonline.part_2;
/* ������ 2.5
* 	 ������������ ���������� ������� ������� n �� ��������� �������(n - ������)
*       1  1  1  1  1  1  1  1
*       2  2  2  2  2  2  2  0
*		3  3  3  3  3  3  0  0
*		4  4  4  4  4  0  0  0
*		5  5  5  5  0  0  0  0
*		6  6  6  0  0  0  0  0
*		7  7  0  0  0  0  0  0
*		8  0  0  0  0  0  0  0
*/

public class Task2_2_5 {
	public static void main(String[] args) {
		int n=8;
		int m=8;
		int i=0;
		int j=0;
		int[][] a = new int[n][m];// ������������ ������� 

		for (i=0;i<=n-1;i++) {   //��������� �������		�� ��������
			for (j=0;j<n-i;j++) { //�� �������� �� (j-1)  - �� ������� ���������
			 a[i][j]=i+1;		  // ������ ������� �� ������� ��������� �������� ���� ��������
			}
		}
	
		for (i=0;i<=n-1;i++) { //������� ���������� �������
			for (j=0;j<=m-1;j++) { 
				 System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}