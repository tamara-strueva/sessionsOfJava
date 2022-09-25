package session1_Introduction;
import java.lang.*;
import java.util.Scanner;

public class ReadKeyboard {
    public static void main(String[] args) {
        // сканер в библиотеке, без импорта выведет сообщение об ошибке
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); // читает число типа инт
        // float x = scan.nextFloat(); // читает число типа флот
        // String x = scan.next(); // читает строку (но только первое слово)
        // String x = scan.nextLine(); // читает строку целиком
        System.out.println(x);
    }
}
