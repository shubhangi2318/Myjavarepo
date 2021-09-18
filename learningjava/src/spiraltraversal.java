public class spiraltraversal {
    public static void main(String[] args) {
        int n=4;
        int m=4;
        long arr[][] = new long[n][m];
        int ele =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              arr[i][j]=ele;
              ele++;
            }
        }
        System.out.println("The original array is -");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%3d",arr[i][j]);

            }
        }
     int rowstart =0;
        int rowend = n-1;
        int colstart = 0;
        int colend = m-1;
        System.out.println("Array after traversal is -");
        while(rowstart <= rowend && colstart <= colend){
            for(int col = colstart; col <= colend; col++){
                System.out.print(arr[rowstart][col] + " ");
            }
            rowstart++;

            for(int row= rowstart; row <= rowend ; row++){
                System.out.print(arr[row][colend] + " ");
            }
            colend--;

            if(rowstart <= rowend){
                for(int col = colend; col >= colstart; col--){
                    System.out.print(arr[rowend][col] + " ");
                }
                rowend--;
            }
            if(colstart <= colend){
                for(int row = rowend; row >= rowstart; row--){
                    System.out.print(arr[row][colstart] + " ");
                }
                colstart++;
            }
        }
    }
}
