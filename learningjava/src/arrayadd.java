import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("array without any elements");


        for(int i = 0; i < 5; i++){
            a.add(i+1);
        }
        for(int i=0; i<5; i++) {
            System.out.println(a.get(i));
        }
        System.out.println(a);
       a.set(3,8);
       System.out.println(a);
       a.remove(2);
        System.out.println(a);

    }
}
