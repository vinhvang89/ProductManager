public class Test {
    public static void main(String[] args) {
//        final boolean UP = true;
//        final boolean DOWN = false;
//        ProductManager products = new ProductManager();
//        products.add(1001,"Sword",300);
//        products.add(1002,"Knife",100);
//        products.add(1003,"Spear",500);
//        products.add(1004,"Shield",499);
//        products.add(1005,"Armor",999);
//        products.sortDown();
//        products.deleteById(1004);
//        products.display();
        LinkedProducts products1 = new LinkedProducts();
        products1.addLast(1001,"Revolver",1200);
        products1.addFirst(1000,"Shotgun",2000);
        products1.addLast(1002,"SubMachine",1500);
        products1.addFirst(1008,"Rifle",300);
        products1.addLast(1009,"B52",34000);
        products1.addIndex(1,1010,"Sniper",4500);
        products1.display();
    }
}
