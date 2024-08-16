package String;

public class TrimLeading {
    public static void main(String[] args) {

        String str = "      Ruturaj";

        System.out.println("Original :" + str);

        // By Method...
        System.out.println("By Method :" + str.trim()); /// It removes both before and after spaces

        // By Logic...
        char ch[] = str.toCharArray();
        System.out.println("By Logic : ");

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 32) {
                continue;
            }
            System.out.print(ch[i]);
        }

        // By Logic to remove before spaces only ...
        System.out.println("\n__________________________________________");
        int j = 0;
        str.trim();
        while (j < str.length() && str.charAt(j) == 32) {
            j++;
        }
        System.out.println(j);
        System.out.println(str.substring(j, str.length()));
        System.out.println(str);
    }

}
