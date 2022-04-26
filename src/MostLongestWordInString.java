public class MostLongestWordInString {
    public static void main(String[] args) {
        String str = "Hellorwtret . < world 123 asgfagsd f";
        System.out.println(longestWord(makeStringArray(str)));
    }

    public static String[] makeStringArray(String str) {
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        return words;
    }

    public static String longestWord(String[] arr) {
        String longestWord = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (longestWord.length() < arr[i].length()) {
                longestWord = arr[i];
            }
        }
        return longestWord;
    }

}
