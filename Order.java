import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private double total;
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    public void addItem(Item aItem){
        this.items.add(aItem);
        this.total += aItem.getPrice();
    }

    public String getStatusMessage(){
        if(this.ready) return "Your order is ready.";
        return "Thank you for waiting. Your order will be ready soon.";
    }

    // public double getOrderTotal(){
    //     for(Item aItem : this.items){
    //         this.total += aItem.getPrice();
    //     }
    //     return this.total;
    // }


    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(Item aItem : this.items){
            System.out.println( aItem.getName() + ": " + "$" + aItem.getPrice());
            this.total += aItem.getPrice();
        }
        System.out.println("Total: " + "$" + this.total);
    }
    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getStatus(){
        return this.ready;
    }

    public void setStatus(boolean status){
        this.ready = status;
    }

    public double getTotal(){
        return this.total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void setItems(ArrayList<Item> list){
        this.items = list;
    }
}


