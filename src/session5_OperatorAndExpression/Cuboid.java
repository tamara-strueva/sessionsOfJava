package session5_OperatorAndExpression;
import java.lang.*;
import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args){
        int length, breadth, height, totalArea, volume;

        System.out.println("enter sides");
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        breadth = scan.nextInt();
        height = scan.nextInt();

        volume = length * breadth * height;
        System.out.println("volume = " + volume);
        totalArea = 2 * (length*breadth + length*height + breadth*height);
        System.out.println("total area = " + totalArea);
    }
}
