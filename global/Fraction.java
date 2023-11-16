package global;

public class Fraction {
	    public int numerator;	//числитель
	    public int denominator;//знаменатель

	 	public Fraction(int numerator, int denominator){
	        this.denominator = denominator;
	        this.numerator = numerator;
	    }
	 	public int getNumerator() {
	        return numerator;
	    }
	    public int getDenominator() {
	        return denominator;
	    }
	
	    public  String ShortFractToStr() {//сокращаем и выводим в консоль
	        int gcd = NOD(numerator, denominator);
	        return (numerator / gcd) + "/" + (denominator / gcd);
	    }
	    public String toString(){ //выводим в консоль
	        return numerator + "/" + denominator;
	    }
	    
	////НОД	
	    private static int NOD(int a, int b) {
	       return b == 0 ? a : NOD(b, a % b);
	    }
	    ////НОК
	    private static int NOK(int n1, int n2) 
	    	{ 
	    	  return n1*n2 / NOD(n1, n2); 
	    	}
	    public  String ShowFractStr() {//сокращаем и выводим в консоль
	               return (numerator) + "/" + (denominator)+"  ";
	    }

	    public Fraction add(Fraction other) { //сложение дробей
	        Fraction result = new Fraction(1, 1);
	        if (this.denominator == other.denominator) { //если знаменатели одинаковые
	            result.denominator = this.denominator;
	            result.numerator = this.numerator + other.numerator;
	        }else{											// если знаменатели разные
	            int nok = NOK(this.denominator, other.denominator);
	            result.denominator = nok;
	            result.numerator = this.numerator * (nok/this.denominator) + other.numerator * (nok/other.denominator);
	        }
	        return result;
	    }
	    
}



