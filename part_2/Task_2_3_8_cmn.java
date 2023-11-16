package byepam.javaonline.part_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.io.*;
import global.*;





//import byepam.javaonline.part_2.Fraction; 

public class Task_2_3_8_cmn{

////НОД	
public static int NOD(int a, int b) {
	 int tmp;
     while (b != 0) {
         tmp = a % b;
         a = b;
         b = tmp;
     }
     return a;
	
 //  return b == 0 ? a : NOD(b, a % b);
	//return Nod;	
}
////НОК
public static int NOK(int n1, int n2) 
	{ 
	return (n1 / NOD (n1,n2))*n2;
	  //return n1*n2 / NOD(n1, n2); 
	}

//-----------------------------------------------------------------	

	
	
	
	
//-----------------------------------------------------------------
	public static void main(String[] args) {
		String str="";
		int n=4;
		int i=0;
		Fraction fracmass[] = new Fraction[n+1];
//---------------заполняем массив дробей--------------------------		
		for (i=0;i<n+1;i++) {
		  int x=1+(int) Math.round(Math.random()*9);
		  int y=1+(int) Math.round(Math.random()*9);
		  fracmass[i] = new Fraction(x, y);
		  str=str +fracmass[i].ShowFractStr();
	 
		}
		System.out.println(str);
		System.out.println();
		
		Fraction max_denom= new Fraction(fracmass[0].numerator,fracmass[0].denominator);
//---------------------------------------		
//УРЯ!!!!!!
		int k,d;
		
		k=NOK(fracmass[0].denominator,fracmass[1].denominator);
		for (i=2;i<=n;i++) {
			k=NOK(k,fracmass[i].denominator);
			for (i=0;i<=n;i++){
				
				d= k / fracmass[i].denominator;
				
				System.out.print("  "+k % fracmass[i].denominator);
		 		
				fracmass[i].numerator=fracmass[i].numerator*d;
		 		fracmass[i].denominator=fracmass[i].denominator*d;
			};
			System.out.println();
		};
		
		
	/*
function Nod(a,b:integer):integer;
begin
while a<>b do
if a>b then a:=a-b else b:=b-a;
Nod:=a
End;
{нахождение НОК}
function NOK(x,y:integer):integer;
Begin
NOK:=(x div NOD (x,y))*y;
end;
procedure ObshZn(var m:mass;n:integer);
var i,k,d:integer;
begin
k:=NOK(m[1].q,m[2].q);
for i:=3 to n do k:=NOK(k,m[i].q);
for i:=1 to n do
 begin
  d:=k div m[i].q;
  m[i].p:=m[i].p*d;
  m[i].q:=m[i].q*d;
 end;
end;
function Bolshe(a,b:Frac):boolean;
begin
 Bolshe:=a.p>b.p
end;
{сортировка по возрастанию}
procedure Sort(var m:mass;n:integer);
var i,j:integer;
    x:Frac;
begin
for i:=1 to n-1 do
for j:=i to n do
if Bolshe(m[i],m[j])then
 begin
  x:=m[i];
  m[i]:=m[j];
  m[j]:=x;
 end;
end;
 
	
 */
		
		
		
		
		
		
		
		
		
		
//---------------------------------------------------------------		
//		for (i=0;i<n;i++) {
			
			 
			
			
			
			
			
//			int nok = NOK(fracmass[i].denominator, fracmass[i+1].denominator);
///
	///		fracmass[i].denominator = nok;
		//	fracmass[i+1].denominator = nok;
			
		///fracmass[i].numerator = fracmass[i].numerator * (nok/fracmass[i].denominator) ;
///			fracmass[i+1].numerator=fracmass[i+1].numerator * (nok/fracmass[i+1].denominator);
	////	
	//	}	

		
		str="";
		for (i=0;i<n+1;i++) 
			  str=str +fracmass[i].ShowFractStr();
		System.out.println(str);
	}
//---------------------------------------------------------------
}
