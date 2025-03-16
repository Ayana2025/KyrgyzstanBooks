package MyLib;

import java.util.Scanner;

public class WriteNumMode {
    int n;
    public WriteNumMode() {
        System.out.print("\n");
        System.out.print("1. Ввод данных по книгам\n");
        System.out.print("2. Выдать все\n");
        System.out.print("3. Выдать все произведения автора\n");
        System.out.print("4. Выдать авторов по указанному жанру\n");
        System.out.print("5. Выдать данные по книгам за последний год\n");
        System.out.print("6. Выдать данные по книгам с максимальными тиражами.\n");
        System.out.print("7. Удаление книги\n");
        System.out.print("8. Выход");
        int N=8;    //количество опций меню
        System.out.print("\n"+"Введите номер режима - ");
        while (true) {
            Scanner cin = new Scanner(System.in);
            if (cin.hasNextInt()) {
                n = cin.nextInt();
                if (n>=1 && n<= N) {
                    System.out.println("Конец работы");
                    break;
                }
                else System.out.print("Номер режима от 1 до "+N+". Повторите ввод - ");
            } else System.out.print("Вы ввели не число. Повторите ввод - ");
        }
    }
    public int getN() {
        return n;
    }
}
