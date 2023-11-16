package byepam.javaonline.part_2;
import java.io.*;
import global.*;

/* Задача 3.4
* 	 Привести обыкновенные дроби к общему знаменателю и
* 	отсортировать по возрастанию. колличество дробей - N 
*/

import java.io.*;
import global.*;
public class Task2_3_8{

public static int NOD(int a, int b) { // НОД
  return b == 0 ? a : NOD(b, a % b);
}
public static int NOK(int n1, int n2) { // НОК 
  return (n1 / NOD (n1,n2))*n2;
}
//-----------------------------------------------------------------
public static void main(String[] args) {
	String str="";
	int n=3; // количество дробей
	int i=0; // счетчик
	int j=0; // счетчик
	int k=0; // общее кратное
	int d=0; // общий делитель
	int tmp=0; // для обмена при сортировке
	int numerator[]   = new int [n+1]; // числители
	int denominator[] = new int [n+1]; // знаменатели
		
//---------------заполняем массивы числителей и знаменателей--------------------------		
	for (i=0;i<n+1;i++) {
	  int x=1+(int) Math.round(Math.random()*9);
	  int y=1+(int) Math.round(Math.random()*9);
	  numerator[i] = x;
	  denominator[i] = y;
	  str=str +"   "+numerator[i]+"/"+denominator[i];
	}
	System.out.println(str);
	System.out.println();
//-----------------------------------------------------------------------------------		
	k=NOK(denominator[0],denominator[1]); //начальный НОК 1го и 2го знаменателя
	for (i=0;i<=n;i++) k=NOK(k,denominator[i]);//NOK всего массива
	for (i=0;i<=n;i++){ //
		d= k / denominator[i]; 			// нок общий нка числитель каждой дроби
		numerator[i]=numerator[i]*d;	// приводим к общему знаменателю
		denominator[i]=denominator[i]*d;// каждую дробь
	};
	System.out.println();
//-----------------------сортировка числителей (пузырьком)---------------------------
	for(i = numerator.length-1 ; i > 0 ; i--){
       for(j = 0 ; j < i ; j++){
           if(numerator[j] > numerator[j+1] ){
                tmp = numerator[j];
                numerator[j] = numerator[j+1];
                numerator[j+1] = tmp;
           }
       }
    }
 //-------------------вывод в консоль-------------------------------------------------
	str="";
	for (i=0;i<n+1;i++) 
		str=str +"   "+numerator[i]+"/"+denominator[i];
		System.out.println(str);
	}
//---------------------------------------------------------------
}
