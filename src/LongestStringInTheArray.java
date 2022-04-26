public class LongestStringInTheArray {
    public static void main(String[] args) {
        String[] arr = {"aaaa", "bbb", "ccccc", "ddd"};
        System.out.println(longestStringInTheArray(arr));
    }

    public static String longestStringInTheArray(String[] arr) {
        int[] count = new int[arr.length];
        int longestString = arr[0].length();
        int longestStringCount = 1;
        int longestStringCount2 = 0;

        for (int i = 1; i < arr.length; i++) {
            if (longestString <= arr[i].length()) {
                longestStringCount = i;
                if (longestString == arr[i].length()) {
                    longestStringCount2 = i + 1;
                }
            }
        }

        String str = "";
        if (longestStringCount2 == 0) {
            str = "Самое большое слово в массиве " + longestStringCount;
        } else str = "Самые большие слова в массиве " + longestStringCount + " и " + longestStringCount2;
        return str;
    }
}