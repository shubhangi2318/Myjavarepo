import java.util.ArrayList;
import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<Integer>();
        //The program should accept input from the user
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
      Object[] a = arr.toArray();
        Arrays.sort(a);
        for(int i=0; i<5;i++){
            System.out.println(a[i]+" ");
        }


    }
}
