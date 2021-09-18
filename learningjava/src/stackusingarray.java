public class stackusingarray {
    int maxsize ;
    int arr[];
    int top;

    stackusingarray(int size){
        maxsize = size;
        arr = new int[maxsize];
        top =-1;

    }
    public void push(int ele){
        if(top == maxsize-1){
           System.out.println("Stack is full , so cannot insert the element.");
        }
        else {
            top++;
            arr[top] =ele;
            System.out.println("element inserted");
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack is Empty, nothing to delete.");
        }
        else {
            top--;
            System.out.println("element deleted");
        }
    }

    public void peek(){
        if(top == -1){
            System.out.println("Stack is empty , nothing to print");
        }
        else {
            System.out.println(arr[top]);
        }
    }



    public static void main(String[] args) {
        stackusingarray sa = new stackusingarray(5);
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.peek();
        sa.pop();
        sa.peek();


    }
}

