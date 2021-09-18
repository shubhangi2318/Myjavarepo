import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();
        System.out.println("byte is - "+b);
        System.out.println("short is - "+s);
        System.out.println("int is - "+i);
        System.out.println("long is - "+l);

        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);
        String str1 = sc.next();
        sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("float is - " + f);
        System.out.println("double is - "+ d);
        System.out.println("character is - "+ c);
        System.out.println("words is - " + str1);
        System.out.println("paragraph is -" + str2);

        boolean bl = sc.nextBoolean();
        System.out.println("boolean is - " + bl);
    }
}
