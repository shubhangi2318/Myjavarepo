public class linearsearch {
    public static void main(String[] args) {
int arr[] = {2,4,6,8,10};
int size = arr.length;
int ele = 6;
int i;
for( i=0;i<size;i++){
    if(arr[i] == ele){
        break;
    }
}
if(i != size){
    System.out.println("Ele found at" + i);
}
else {
    System.out.println("ele not found");
}
    }
}
