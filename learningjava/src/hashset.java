import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(23);
        hs.add(18);
        hs.add(50);
        hs.add(-25);
        hs.add(34);
        for (Integer n :hs){
            System.out.println(n);
        }
    }
}
