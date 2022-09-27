package session2_DataTypes;

public class Literals {
    public static  void main(String[] args) {
        byte b = 15;
        System.out.println();
        short s = 15;
        int i = 15;
        // it is integer literals which can be written in any system

        byte b1 = 10; //десятеричная система
        byte b2 = 0b1010; //двоичная система
        byte b3 = 012; //восьмеричная система
        byte b4 = 0xA; //шеснадцатиричная система

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        long l= 9_999_999_999L;
        // для разделания числа можно использовать _ для читабельности
        float f=12.56f;
        double d=12.56d;

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
