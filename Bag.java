import java.util.ArrayList;

public class Bag{
    private ArrayList<Item> items;
    private int limit;

    public Bag(){
        this.items = new ArrayList<Item> ();
        limit = 10;
    }
    public void addItem(String name){
        if(name.equals("Water")){
            this.items.add(new Water(name));
        }
        else if(name.equals("Cake")){
            this.items.add(new Cake(name));
        }
        else if(name.equals("Drug")){
            this.items.add(new Drug(name));
        }
    }
    public void showItem(){
        System.out.println("------------------");
        System.out.println("My Item");
        for(int i=0; i<items.size(); i++){
            items.get(i).show();
        }
        System.out.println("------------------");
    }
    
    
}