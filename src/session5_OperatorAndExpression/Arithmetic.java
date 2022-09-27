package session5_OperatorAndExpression;

public class Arithmetic {
    public static void main(String[] args) {

        // for integer values
        int a1 = 14, b1 = 5;

        int c1 = a1/b1;
        int r1 = a1%b1;

        System.out.println("c1 = " + c1);
        System.out.println("r1 = " + r1);

        //for float values
        float a2 = 14.3f, b2 = 3.2f;

        float c2 = a2/b2;
        float r2 = a2%b2;

        System.out.println("c2 = " + c2);
        System.out.println("r2 = " + r2);

        // for different data types
        byte a3 = 10;
        short b3 = 15;
        int c3 = a3 + b3;
        System.out.println("c3 = " + c3);

        float a4 = 12.5f;
        long b4 = 1231;
        float c4 = a4*b4;
        System.out.println("c4 = " + c4);

        float a5 = 12.5f;
        double b5 = 123;
        double c5 = a5*b5;
        System.out.println("c5 = " + c5);

        char a6 = 40;
        int b6 = 30;
        int c6 = a6-b6;
        System.out.println("c6 = " + c6);


        System.out.println((10+20)/2);
        System.out.println(10/(2*5));
    }
}
