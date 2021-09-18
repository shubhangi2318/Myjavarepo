import java.sql.SQLOutput;
import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        i = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("Integer number" + i);
        System.out.println("string is - "+str);

    }
}
