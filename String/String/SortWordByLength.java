package String;

import java.util.Arrays;

public class SortWordByLength {
    public static void main(String[] args) {

        String name[] = { "Ruturaj", "Chetan", "Saurabh", "Ravindra", "Avishkar" };

        System.out.println("Original : " + Arrays.toString(name));
        String temp = "";
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++)

                if (name[i].length() > name[j].length()) {
                    temp = name[j];
                    name[j] = name[i];
                    name[i] = temp;
                }
        }
        System.out.println("Sorting : " + Arrays.toString(name));

    }
}
