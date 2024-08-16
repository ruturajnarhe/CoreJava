package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());

        StringBuffer sb2 = new StringBuffer(" Ruturaj ");
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer(100);
        System.out.println(sb3.capacity());

        sb2.ensureCapacity(50);
        System.out.println(sb2.capacity());

        sb2.append(" Narhe");
        System.out.println(sb2);

        sb2.insert(8, "Chetan");
        System.out.println(sb2);

        sb2.replace(1, 7, "Ravindra");
        System.out.println(sb2);

        sb2.delete(9, 14);
        System.out.println(sb2);

        sb2.reverse();
        System.out.println(sb2);

        // System.out.println(sb2.compareTo(sb3));
        // System.out.println(sb2.compareTo(sb2));

    }
}
