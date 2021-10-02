public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
        int j=0;
        while(j<n){
           System.out.println(j);
           j++;
        }

        int k=0;
        do {
            System.out.println(k);
            k++;
        }
        while(k<n);
    }
}
