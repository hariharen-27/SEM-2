interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class interfaces implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
interfaces obj = new interfaces();  
obj.print();  
obj.show();  
 }  
}  