package byepam.javaonline.part_2;
/*  ������ 1.8
 *    ����  ������������������  �����  ����� a1, a2, a3, ... an.
 *    ����������  �����  ������������������,  ��������  �� 
 *       �������� �� �����, ������� ����� min(a1, a2, a3, ... an)
*/
import global.Global;
public class Task2_1_8 {
	public static void main(String[] args) {
		int n=Global.InPutIntVal("������� ����������� ������� n: ");		 
	 
		int[] a = new int[n];	     		// ������ ���-�� ��������� ������� �������
		a = Global.GenVectorInt_rnd(n);     // ��������� ���������� ������� � ������� ������ � �������
	 
		int i=0;
		int j=0;		
		int k=0;			
	 
		int min=a[0];
		for (i=0;i<n;i++ ) if (min>a[i]) min =a[i]; //������� ����������� ������ �������
		System.out.println("\n����������� �������:"+ min);
	 
		for (i=0;i<n;i++ )if (a[i]!=min) k++;  //������������ ������ �������� ������������������
		
	 
		int[] b = new int[k];				   // ����� ������������������
	
		System.out.println("\n�������� ������: ");
		for  (i=0; i<=n-1; i++){			  // ���� �� ���������� �������
			if (a[i]!= min ) {				  // ���������� ��� �������� ������ ������������
				b[j]=a[i];					  // ���������� ����� ������������������
				System.out.print("\t"+ +b[j]);// ����� ������� ���� � �������
				j++;						  // ������������ ������� ����������� �������� ������������������
			}
 }

	 
	 
	 
	 
	 
		 
	 

	 
	
}
}
