package linkedlist;

public class Demo {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertAtBeginning(9);
        list.insertAtBeginning(3);
        list.insertAtBeginning(5);
        
        list.insertAtPosition(1,10);
        list.display();
        
    }
}
