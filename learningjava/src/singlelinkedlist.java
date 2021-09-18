import org.w3c.dom.Node;

import javax.swing.*;

public class singlelinkedlist {
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void traverse(){
        if(head == null){
            System.out.println("Linked list is empty.");
        }
        else{
            Node curr = head;
            while(curr != null){
            System.out.println(curr.data);
            curr=curr.next;
            }
        }
    }
    public void insertatstart(int data){
        Node n = new Node(data);
        if(head != null){
           n.next = head;
        }
        head = n;
        size =size+1;
    }
    public void insertatend(int data){
        Node n= new Node(data);
        if(head == null){
            head =n;
        }
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;

        }
        size =size+1;
    }
    public void insertatpos(int pos, int data){
        Node n = new Node(data);
        if(pos <= 0 || pos > (size+1)){
           System.out.println("you cannot insert at this position");
        }
        else{
            if(pos == 1){
                insertatstart(data);
            }
            else if(pos == (size+1)){
                insertatend(data);
            }
            else{
                int currpos =1;
                Node prevnode = head;
                while(currpos != (pos-1)){
                    currpos=currpos+1;
                    prevnode = prevnode.next;
                }
                n.next = prevnode.next;
                prevnode.next = n;
                size = size+1;
            }
        }
    }
    public void deleteatstart(int pos){
        if(head == null){
            System.out.println("List is empty, nothing to delete");
        }
        else {
            Node temp = head;
            if(pos == 1){
                temp.next =head;
                temp.next =null;
            }
            else {

                for(int i=1; i< pos-1;i++){
                    temp = temp.next;
                }
                Node dn = temp.next;
                temp.next = dn.next;
               dn.next =null;
            }
size=size-1;
        }
    }

    public static void main(String[] args) {
        singlelinkedlist sl = new singlelinkedlist();
        sl.insertatstart(2);
        sl.insertatpos(2,3);
        sl.insertatpos(3,4);
        sl.insertatpos(4,5);
        sl.insertatend(10);
        sl.traverse();
        sl.deleteatstart(2);
        sl.traverse();
    }
}


