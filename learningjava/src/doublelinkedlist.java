import org.w3c.dom.Node;

public class doublelinkedlist {
    Node head;
    int size;
    class Node{
        Node prev;
        Node next;
        int data;
        Node(int d){
            data=d;
            prev=next=null;
        }
    }
    public void traverse(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else {
           while(temp != null){
               System.out.println(temp.data);
               temp =temp.next;
           }
        }
    }
public void insertatstart(int data){
        Node n = new Node(data);
        if(head !=null){
            head.prev=n;
        }
        head = n;
        size=size+1;
}
public void insertatend(int data){
        Node n = new Node(data);
        if(head == null){
            head =n;
        }
        else {
          Node last = head;
          while(last.next != null){
              last=last.next;
          }
            last.next=n;
          n.prev=last;
        }
        size =size+1;
}

public void insertatpos(int pos, int data){
        if(pos <=0 || pos >(size+1)){
            System.out.println("You cannot inseert at this invalid position");
        }
        else {
            if(pos == 1){
                insertatstart(data);
            }
            else if(pos == (size+1)){
                insertatend(data);
            }
            else {
                int currpos =1;
                Node prevnode = head;
                while(currpos != (pos-1)){
                    currpos = currpos+1;
                    prevnode = prevnode.next;
                }
                Node n = new Node(data);
                n.prev = prevnode;
                n.next = prevnode.next;
                prevnode.next = n;
                prevnode.next.prev=n;
                size=size+1;
            }

        }
}
public void delete(int pos){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else if(pos <1 || pos> size){
            System.out.println("You cannot insert at invalid positions");
        }
        else {
            Node temp=head;
            if(pos ==1){
                temp.next.prev=null;
                head=temp.next;
                temp.next=null;
            }
            else{
                int currpos =1;
                for(int i=0; i<(pos-1);i++){
                    temp=temp.next;

                }
                Node dn =temp.next;
                if(pos == size){
                    temp.next=null;
                    temp.next.prev=null;
                }
                else{
                    temp.next=dn.next;
                    temp.next.prev=temp;
                    dn.next=null;
                    dn.prev=null;
                }
            }
            size=size-1;
        }
}
    public static void main(String[] args) {
        doublelinkedlist dl = new doublelinkedlist();
        dl.insertatstart(5);
        dl.insertatpos(2,10);
        dl.insertatpos(3,15);
        dl.insertatpos(4,20);
        dl.insertatpos(5,25);
        dl.insertatend(30);
        dl.traverse();
        dl.delete(2);
        dl.traverse();
    }
}
