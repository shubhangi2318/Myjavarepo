public class arraymultiplication {

    public static void main(String[] args) {
        int s1=2, s2=3, s3=4;
        int arr1[][] = new int[s1][s2];
        int arr2[][] = new int [s2][s3];
        int arr3[][] = new int [s1][s3];
        int ele =1;
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
             arr1[i][j]=ele;
             ele++;
            }
        }
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                arr2[i][j]=ele;
                ele++;
            }
        }
        for(int i=0;i<s1;i++) {
            for (int j = 0; j < s3; j++) {
                for (int k = 0; k < s2; k++) {
                    arr3[i][j] = arr3[i][j] + (arr1[i][k] * arr2[k][j]);
                    ele++;
                }
            }
        }
        for(int i=0;i<s1;i++){
            for(int j=0;j<s3;j++){
               System.out.println(arr3[i][j]);
            }
        }
    }
}
