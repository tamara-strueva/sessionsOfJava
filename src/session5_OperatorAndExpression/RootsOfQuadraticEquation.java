package session5_OperatorAndExpression;
import java.lang.*;
import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        int a, b, c;
        double r1, r2;

        System.out.println("enter A, B and C");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        double D = Math.pow(b, 2) - 4*a*c;

        if (D > 0) {
            r1 = (-b + Math.sqrt(D))/2*a;
            System.out.println("r1 = " + r1);
            r2 = (-b - Math.sqrt(D))/2*a;
            System.out.println("r2 = " + r2);
        }else if (D == 0) {
            double r = -b/2f*a;
            System.out.println("r = " + r);
        }else {
            System.out.println("there is no root");
        }

    }
}
