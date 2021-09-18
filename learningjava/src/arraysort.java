import java.util.ArrayList;
import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<Integer>();
        arr.add(20);
        arr.add(30);
        arr.add(10);
        arr.add(50);
        arr.add(40);
      Object[] a = arr.toArray();
        Arrays.sort(a);
        for(int i=0; i<5;i++){
            System.out.println(a[i]);
        }


    }
}
