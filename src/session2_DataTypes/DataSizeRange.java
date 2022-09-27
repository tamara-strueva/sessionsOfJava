package session2_DataTypes;
import java.lang.*;

public class DataSizeRange {
    public static void main(String[] args) {
//        int x; // primitive
//        Integer y; // class (wrapper)

        System.out.println("Int Min: " + Integer.MIN_VALUE); // -2.147.483.648
        System.out.println("Int Max: " + Integer.MAX_VALUE); // 2.147.483.647
        System.out.println("Int Bytes :" + Integer.BYTES); // 4

        System.out.println("Byte Min: " + Byte.MIN_VALUE); // -128
        System.out.println("Byte Max: " + Byte.MAX_VALUE); // 127
        System.out.println("Byte Bytes :" + Byte.BYTES); // 1

        System.out.println("FLoat Min: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Float Max: " + Float.MAX_VALUE); // 3.4028235E38
        System.out.println("Float Bytes :" + Float.BYTES); // 4

        // Boolean type does not have MAX or MIN value

    }
}
