import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(18);
        ts.add(50);
        ts.add(23);
        ts.add(18);
        ts.add(-23);
        System.out.println(ts);
    }
}
