import java.util.Arrays;

public class ProductManager extends Product {
   private Product[] array;
   private final int DEFAULT_CAPACITY = 10;
   private int capacity;
   private int index = 0;
   public ProductManager(){
       capacity = DEFAULT_CAPACITY;
       array = new Product[capacity];
   }
   private void ensureSize(){
       if(index == capacity -1)
           array = Arrays.copyOf(array,capacity*2);
   }
   public void add(int id, String name,double price){
       Product product = new Product(id,name,price);
       ensureSize();
       array[index]= product;
       index++;
   }
   public void editName(int id ,String newName){
       for (int i = 0; i < index ; i++) {
           if (array[i].getId() == id) {
               array[i].setName(newName);
               break;
           }
       }
   }
    public void editPrice(int id ,double newPrice){
        for (int i = 0; i < index ; i++) {
            if (array[i].getId() == id) {
                array[i].setPrice(newPrice);
                break;
            }
        }
    }
    public void deleteById(int id){
       Product[] temp = new Product[array.length];
       int j = 0;
        for (int i = 0; i < index ; i++) {
            if (array[i].getId() != id) {
                temp[j] = array[i];
                j++;
            }
        }
        index--;
        array = temp;
    }
    public void display(){
        for (int i = 0; i < index ; i++) {
           System.out.println("ID : "+array[i].getId()+" , Name : "
                   +array[i].getName()+" , Price: "+array[i].getPrice());
       }
    }
    public void searchByName(String name){
       for (Product product: array)
           if(product.getName().equalsIgnoreCase(name)) {
               System.out.println("ID : " + product.getId() + " , Name : "
                       + product.getName() + " , Price: " + product.getPrice());
               break;
           }
    }
    public void sortUp(){
        Product temp ;
        for (int i = 0; i < index -1 ; i++) {
            for(int j = i+1; j < index;j++){
                if( array[i].getPrice() > array[j].getPrice()){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public void sortDown(){
        Product temp ;
        for (int i = 0; i < index -1 ; i++) {
            for(int j = i+1; j < index;j++){
                if( array[i].getPrice() < array[j].getPrice()){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
