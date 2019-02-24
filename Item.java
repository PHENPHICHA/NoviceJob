
public class Item{
    private String name;
    private int exp;
    private int hp;
    private int mana;

    public Item (String name,int exp, int hp, int mana){
        this.name=name;
        this.exp=exp;
        this.hp=hp;
        this.mana=mana;
    }
    public void show(){
        System.out.println("Name : "+this.name);
        System.out.println("EXP : "+this.exp);
        System.out.println("HP : "+this.hp);
        System.out.println("Mana : "+this.mana);
        System.out.print("\n");
    }
}

class Water extends Item{

    public Water(String name){
        super(name, 100, 0, 0);
    }
}

class Cake extends Item{

    public Cake(String name){
        super(name, 0, 0, 100);
    }
}

class Drug extends Item{

    public Drug(String name){
        super(name, 0, 200, 0);
    }
}


