

public class Fraction {
    public static void main(String[] args){}
    
    private int num;
    private int den;
        
    public int getNumerator() {
        return num;
    }
    
    public int setNumerator(int numerator) {
        this.num = numerator;
        return 0;
    }
    
    public int getDenominator() {
        return den;
    }
    
    public int getDenominator(int denominator) {
        this.den = denominator;
        return 0;
    }
    //CONSTRUCTOR:
    public Fraction(int num, int den) {
       this.num = num;
       this.den = den;
    
    }
}