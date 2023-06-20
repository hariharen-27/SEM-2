package linkedlist;



public class LinkedList {
    Node head;


    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }

    LinkedList(){
        head=null;

    }
    public void insertAtBeginning(int val){
        Node newNode=new Node(val);
        if(head==null){
            head= newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }

    }
    public void insertAtPosition(int position,int value){
        Node newNode=new Node(value);
        Node temp=head;
        if(position==0){
            newNode.next=head;
            head=newNode;
            // insertAtBeginning(value);
            return;
        }
        for(int i=1;i<position;i++){
            temp=temp.next;
            if(temp==null){
                System.out.println("invalid position");
                return;
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;


    }
    public void display(){
        Node currNode=head;
        while (currNode!=null){
            System.out.println(currNode.data+ " ");
            currNode=currNode.next;

        }
    }
}
