import java.util.Scanner;

public class SubstringReplacement {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();

        System.out.println("Введите подстроку которую хотите заменить:");
        Scanner sc2 = new Scanner(System.in);
        String scSubstring = sc2.nextLine();

        System.out.println("Введите подстроку на которую хотите заменить:");
        Scanner sc3 = new Scanner(System.in);
        String scNewSubstring = sc3.nextLine();

        System.out.println(replacementSubstring(scString, scSubstring, scNewSubstring));

    }

    public static String replacementSubstring(String str, String subStr, String newSubStr) {
        String newStr = str.replaceAll(subStr, newSubStr);
        return newStr;
    }

}
