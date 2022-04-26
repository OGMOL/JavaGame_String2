public class RemovingExtraSpaces {
    public static void main(String[] args) {
        String str = "   Hello    rwtret world   2  лгплрг asgfagsd    f         ";
        System.out.println(removingExtraSpaces(str));
    }

    public static String removingExtraSpaces(String str) {
        str = str.replaceAll("\\s+", " ");
        str = str.trim();
        return str;
    }
}
