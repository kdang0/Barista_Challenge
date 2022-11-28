public class TestOrders {

    public static void main(String[] pain) {
        Item item1 = new Item("mocha", 1.45);
         
        Item item2 = new Item("latte", 2.5);
    
        Item item3 = new Item("drip coffee", 4.45);
        
        Item item4 = new Item("capuccino", 6.45);
        
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        
        Order order2 = new Order("Jimmy");
        
        Order order3 = new Order("Noah");
        order3.addItem(item1);
        order3.addItem(item2);
        order3.display();
        System.out.println("TOTAL " + order3.getTotal());
        Order order4 = new Order("Sam");
        
        
    }
}
