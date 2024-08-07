package Arrays;

public class ArrayCreation {
    public static void main(String[] args) {

        Object obj[] = new Object[5];
        obj[0] = 2.3f;
        obj[1] = 4;
        obj[2] = 12.32;
        obj[3] = 'R';
        obj[4] = "Ruturaj";

        for (Object arr : obj)
            System.out.println(arr);

    }
}
