import MyLib.WriteNumMode;

public class Main {
    public static void main(String[] args) {
        System.out.println("+---------------------+");
        System.out.println("| Книги в Кыргызстане |");
        System.out.println("+---------------------+");

        WriteNumMode writeNumMode = new WriteNumMode();
        int n = writeNumMode.getN();
        System.out.println("Введен номер: "+n);
    }
}