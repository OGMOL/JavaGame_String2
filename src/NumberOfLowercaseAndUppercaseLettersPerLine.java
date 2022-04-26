import java.util.Scanner;

public class NumberOfLowercaseAndUppercaseLettersPerLine {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("В строке " + numbersLetter(strLowercaseLetter(str)) + " маленьких, " + numbersLetter(strUppercaseLetter(str)) + " больших букв.");

    }

    public static String strLowercaseLetter(String str) {
        String newStr = str.replaceAll("[^a-z]", "");
        return newStr;
    }

    public static String strUppercaseLetter(String str) {
        String newStr = str.replaceAll("[^A-Z]", "");
        return newStr;
    }

    public static int numbersLetter(String str) {
        int numbers = str.length();
        return numbers;
    }

}
