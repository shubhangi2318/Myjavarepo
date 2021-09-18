import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer>  hm = new HashMap<String, Integer>();
        hm.put("n", 18);
        hm.put("s", 23);
        System.out.println(hm.get(("s")));
    }
}
