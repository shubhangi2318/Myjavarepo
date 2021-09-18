import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class hashmapexample {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> ha = new HashMap<>();
        boolean c = true;

        while(c){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Batch Name");
            String bname = sc.nextLine();

            System.out.println("Enter the marks");
            int m = sc.nextInt();

            boolean batch = ha.containsKey(bname);
            ArrayList<Integer> marks;

            if (batch){
                marks = ha.get(bname);
            }
            else {
                marks = new ArrayList<Integer>();
            }

           marks.add(m);
            ha.put(bname , marks);
            System.out.println(ha);
            System.out.println("Do you want to continue ?");

            char choice = sc.next().charAt(0);
            if(choice == 'n' || choice == 'N'){
                c = false;
            }
        }
    }
}
