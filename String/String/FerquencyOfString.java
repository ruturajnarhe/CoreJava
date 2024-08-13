package String;

import java.util.Arrays;

public class FerquencyOfString {
    public static void main(String[] args) {

        String str = "Ruturajaaaa";

        char ch[] = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        int a = 0;
        int b = 0;
        int max = 0;
        int min = ch[0];
        char temp = 'R';
        char temp1 = 't';
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count != 0) {
                boolean notOccured = true;
                for (int k = i - 1; k >= 0; k--) {
                    if (ch[i] == ch[k])
                        notOccured = false;
                }
                if (notOccured) {
                    System.out.println("Character " + ch[i] + " : " + (count + 1));

                    a = (count + 1);
                    b = (count + 1);

                    if (a > max) {
                        max = a;
                        temp = ch[i];
                    }
                    if (b < min) {
                        min = b;
                        temp1 = ch[i];
                    }
                }
            }
        }
        System.out.println("Character " + temp + " Max Frequncy " + max);
        System.out.println("Character " + temp1 + " Min Frequency " + min);
    }

}
