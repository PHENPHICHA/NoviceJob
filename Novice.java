
public class Novice{
    private String name;
    protected int exp;
    protected int hp;
    protected int mana;
    private Bag bag;

    public Novice (String name){
        this.name = name;
        this.exp = exp;
        this.hp = hp;
        this.mana = mana;
        this.bag = new Bag();
    }

    public void upEXP(int exp){
        this.exp =+ exp;
    }
    public void upHP(int heal){
        hp = hp + heal;
    }
    public void downHP(int damage){
        hp = hp - damage;
    }
    public void upMANA(int reset){
        mana = mana + reset;
    }
    public void downMANA(int power){
        mana = mana - power;
    }
    public void showInfo(){
        System.out.println("------------------");
        System.out.println("My Infomation");
        System.out.println("Name : "+this.name);
        System.out.println("EXP : "+this.exp);
        System.out.println("HP : "+this.hp);
        System.out.println("Mana : "+this.mana);
        System.out.println("------------------");
    }
    public int acolyteHP(int heal){
        return hp = 1000;
    }
    public int magicianHP(int heal){
        return hp = 2000;
    }
    public int allEXP(int exp){
        return exp = 0;
    }
    public int allMANA(int reset){
        return mana = 200;
    }
    public void addItem(String itemName){
        this.bag.addItem(itemName);
    }
    public void showItems(){
        this.bag.showItem();
    }

}

class Acolyte extends Novice{

    public Acolyte(String name){
        super(name);
    }
}

class Magician extends Novice{

    public Magician(String name){
        super(name);
    }
}
