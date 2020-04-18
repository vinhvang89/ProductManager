public class LinkedProducts {
   Node head;
   int size;
   public LinkedProducts(){

   }
   private static class Node{
       Node next;
       Product product;
       public Node(Product product){
           this.product = product;
       }
   }
   public void addFirst(int id , String name,double price){
       Product product = new Product(id,name,price);
       if( head == null)
           head = new Node(product);

       else {
           Node temp = head;
           head = new Node(product);
           head.next = temp;
       }
       size++;
   }
   public void addLast(int id , String name,double price){
       Product product = new Product(id,name,price);
       if( head == null)
           head = new Node(product);
       else {
           Node font = null;
           Node current = head;
           while (current != null){
               font = current;
               current = current.next;
           }
           font.next= new Node(product);
       }
       size++;
   }
   public void delete(int index){
      if(head == null){
          System.out.println("This list is empty");
      }else {
          if (index == 0) {
              head = head.next;
          } else {
              Node front = null;
              Node current = head;
              for (int i = 0; i < index; i++) {
                  front = current;
                  current = current.next;
              }
              assert front != null;
              front.next = current.next;
          }
          size--;
      }
   }
   public void addIndex(int index,int id , String name ,double price){
       Product product = new Product(id,name,price);
       if( index > size || index < 0)
           throw new NullPointerException();
       else {
           Node front = null;
           Node current = head;
           for (int i = 0; i < index ; i++) {
                front = current;
                current = current.next;
           }
           assert front != null;
           front.next = new Node(product);
           front.next.next = current;

       }

   }
   public void display(){
       Node temp = head;
       while (temp != null){
           System.out.println(temp.product.toString());
           temp = temp.next;
       }
   }

}
