package byepam.javaonline.part_2;

/* ������ 2.3
* 	 ���� �������. ������� k-� ������ � p-� ������� �������/
*/
import global.Global;
public class Task2_2_3 {
	public static void main(String[] args) {

		int n=10;
		int m=15;
		int i=0;
		int j=0;
		String str1="\t";
		String str2="\t";
		
		int k =Global.InPutIntVal("����� ������ (k<n): ");
		if (k>n||k<0) { 
			System.out.println("k:: �������� ���������� �����!");
			System.exit(0);
		}
		int p =Global.InPutIntVal("����� �������(p<m): ");
		if (p>n||p<0) { 
			System.out.println("p:: �������� ���������� ��������!");
			System.exit(0);
		}
		int[][] a = new int[n][m];
		a=Global.GenMatrixINT_rnd( n, m); 
		System.out.println("\n");
		for (i=0;i<=p-1;i++)str1=str1+"\t"; // ��������� TAB-�� �� ������� ��� �������
		System.out.println("\n\n������� �="+k+"-� ������, p="+p+"-� �������: \n");
		for (i=0;i<=m-1;i++) System.out.print("\t"+i); System.out.println("\n"); // ������� ������� ��������
		for (i=0;i<=n-1;i++) {		// ������ �� ��������
			 System.out.print(i);
			 if (i!=k) {
				 System.out.print(str1+a[i][p]);// �������� ������� -  		
			 }
			 else {
				 	for (j=0;j<=m-1;j++) {									// ������ �� �������
				 		System.out.print(str2+a[k][j]); 		//�������� ������ - k
				 	}
			 }
			 System.out.println();
			}		
		}
}
