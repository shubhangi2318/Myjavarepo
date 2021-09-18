public class conversion {
    public static void main(String[] args) {
     int i = 123;
     float f = i;
     System.out.println(f);

     float f1 = 23.1f;
     int i1 = (int)f1;
     System.out.println(i1);

     String s = "strings";
     int i2 = Integer.parseInt(s);
     System.out.println(i2);
    }
}
