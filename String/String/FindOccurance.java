package String;

public class FindOccurance {
    public static void main(String[] args) {

        String str = "Ruturaj";

        // Method...
        System.out.println("By Method : " + str.indexOf('r'));

        char ch[] = str.toCharArray();

        // Logic...
        char s = 'r';
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == s) {
                System.out.println("By Logic : " + i);
                break;
            }
        }

        // Count By Logic
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == s) {
                count++;

            }
        }
        System.out.println("Count is : " + count);

    }
}
