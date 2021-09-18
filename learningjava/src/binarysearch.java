public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        int size = arr.length;
        int low = 0;
        int high = size-1;
        int mid =-1;
        int ele = 12;
        while(low <= high){
          mid = (low +high)/2;
          if(arr[mid] < ele){
              low = mid+1;
          }
          else if(arr[mid] > ele){
              high = mid-1;
          }
          else {
              break;
          }
        }
        if(low > high){
            System.out.println("ele not found");
        }
        else {
            System.out.println("ele found at " + mid);
        }
    }
}
