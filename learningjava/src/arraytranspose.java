public class arraytranspose {
    public static void main(String[] args) {
        int s1=7;
        int s2=4;
        int arr[][] = new int[s1][s2];
        int trans[][] = new int[s2][s1];
        int ele =1;

        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                arr[i][j]=ele;
                ele++;
            }
        }
        System.out.println("the original array is");
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
               System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                trans[j][i]=arr[i][j];
            }
        }
        System.out.println("The transposed array is");
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                System.out.printf("%3d",trans[i][j]);
            }
            System.out.println();
        }
    }
}
