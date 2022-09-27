package session5_OperatorAndExpression;
import java.lang.*;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        /*float base, height, area;

        System.out.println("enter Base of triangle:");
        Scanner scanBase = new Scanner(System.in);
        base = scanBase.nextFloat();

        System.out.println("enter Height of triangle:");
        Scanner scanHeight = new Scanner(System.in);
        height = scanHeight.nextFloat();

        area = base * height / 2;
        System.out.println("area of triangle = " + area);*/

        int a, b, c;
        float p, area;

        System.out.println("enter first side of triangle:");
        Scanner scanA = new Scanner(System.in);
        a = scanA.nextInt();

        System.out.println("enter second side of triangle:");
        Scanner scanB = new Scanner(System.in);
        b = scanB.nextInt();

        System.out.println("enter third side of triangle:");
        Scanner scanC = new Scanner(System.in);
        c = scanC.nextInt();

        p = (a + b + c)/2f;

        area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("area of triangle = " + area);

    }
}
