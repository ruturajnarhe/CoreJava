package String;

public class StringCreation {
    public static void main(String[] args) {

        String str = new String("Ruturaj");
        String str1 = "Ruturaj";
        String str2 = new String("Ruturaj");
        String str3 = "Ruturaj";

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        if (str2 == str1)
            System.out.println("Same");
        else
            System.out.println("Not same");

        if (str == str1)
            System.out.println("Same");
        else
            System.out.println("Not same");

        if (str == str2)
            System.out.println("Same");
        else
            System.out.println("Not same");

        if (str1 == str3)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        System.out.println(str.equals(str2));
    }
}
