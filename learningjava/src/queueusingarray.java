public class queueusingarray {


    private int ms;
    private int queue[];
    private int front;
    private int rear;

    queueusingarray(int s) {
        ms = s;
        queue = new int[ms];
        front = rear = -1;
    }

    void insert(int ele) {
        if (rear == ms - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1 && rear == -1) {
                front = rear = 0;
            } else {
                rear = rear + 1;
            }
            queue[rear] = ele;
            System.out.println("ELement inserted is - " + ele);
        }
    }

    void delete() {
        if (front == -1) {
            System.out.println("Queue is empty , nothin to delete.");
        } else {
            front = front + 1;
            System.out.println("element deleted from queue");
        }

    }

    void traverse() {
        System.out.println("The elements of Queue are - ");
        if (front == -1) {
            System.out.println("the queue is empty , nothing to print");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueusingarray qt = new queueusingarray(5);
        qt.insert(10);
        qt.insert(20);
        qt.insert(30);
        qt.insert(40);
        qt.insert(50);

        qt.traverse();

        qt.delete();
        qt.delete();

        qt.traverse();


    }
    }

