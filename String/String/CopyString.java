package String;

public class CopyString {
    public static void main(String[] args) {

        String str = "RuturajNarhe";
        System.out.println("Original : " + str);
        char ch[] = str.toCharArray();

        System.out.println("Copied : " + String.copyValueOf(ch));

        String str1 = new String(ch);
        System.out.println("Copied 2nd Way : " + str1);

    }
}
