import java.util.Scanner;

public class NumberOfWordsPerLine {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Количество слов в строке = " + numberOfWordsPreLine(str));
    }

    public static int numberOfWordsPreLine(String str) {
        return str.split(" ").length;
    }

}
