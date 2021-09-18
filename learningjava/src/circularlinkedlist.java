import org.w3c.dom.Node;

public class circularlinkedlist {
    Node head;
    int size;
    class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next=null;
        }
    }
    public void traverse(){
        if(head== null){
            System.out.println("The linked list is empty");
        }
        else {
            Node temp = head;
           do{
                System.out.println(temp.data);
                temp = temp.next;
            }
           while(temp != head);
        }
    }
    public void insertatstart(int data){
        Node n = new Node(data);
        if(head != null){
            Node temp = head;
            while(head.next != head){
                temp =temp.next;
            }
            n.next=head;
            temp.next=n;
            head=n;
        }
        else {
            head =n;
            n.next=n;
        }
        size=size+1;
    }
public void insertatpos(int pos, int data){

        if(pos <=0 || pos > (size+1)){
            System.out.println("You cannot insert.");
        }
        else {
            if(pos == 1){
                insertatstart(data);
            }
            else if(pos == (size+1)){
                insertatend(data);
            }
            else {
                Node n = new Node(data);
                int currpos = 1;
                Node temp = head;
                while(currpos != (pos-1)){
                    temp = temp.next;
                    currpos = currpos+1;
                }
                n.next = temp.next;
                temp.next =n;
                size=size+1;
            }
        }
}
public void insertatend(int data){
        Node n = new Node(data);
        if(head != null){
            Node temp =head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = n;
            n.next = head;
        }
        else {
            head = n;
            n.next = n;
        }
        size = size+1;
}

public void deletion(int pos){
        if(head == null){
            System.out.println("The linked list is empty");
        }
        else {
            if(pos == 1){
                Node dn = head;
                Node temp = head;
                while(temp.next !=head){
                    temp = temp.next;
                }
                head= dn.next;
                temp.next=head;
                dn.next=null;
            }
            else if(pos == size){
                Node cn = head;
                for(int i=1;i<pos-1;i++){
                    cn=cn.next;
                }
                Node temp = cn.next;
                cn.next = head;
                temp.next =null;
            }
            else {
                Node temp =head;
                for(int i=1;i<pos-1;i++){
                    temp=temp.next;
                }
                Node dn = temp.next;
                temp.next=dn.next;
                dn.next=null;

            }
            size=size-1;
        }
}
    public static void main(String[] args) {
        circularlinkedlist cl = new circularlinkedlist();
        cl.insertatstart(2);
        cl.insertatpos(2,4);
        cl.insertatpos(3,6);
        cl.insertatpos(4,8);
        cl.insertatend(10);
        cl.traverse();
        System.out.println("Now deletion starts- ");
        cl.deletion(1);
        cl.deletion(3);
        cl.deletion(5);
        cl.traverse();



    }
}
