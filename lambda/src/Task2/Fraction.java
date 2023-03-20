package Task2;

public class Fraction {
    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator is zero.");
        }

        this.denominator = denominator;
        this.numerator = numerator;

        reduce();
    }


    @Override
    public String toString() {
        if(denominator!=1)
            return numerator+"/"+denominator;
        else
            return numerator+"";
    }

    private static int gcd(int a,int b){
        if(a<0)
            a=-1*a;
        if(b<0)
            b=-1*b;
        int t;
        while(b!=0){
            t=b;
            b = a%b;
            a = t;
        }
        return a;
    }

    public void reduce() {
        int gcd = gcd(numerator,denominator);
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
}
