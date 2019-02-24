import java.util.Scanner;

public class Job{
    private Scanner input;
    int addjob;
    int state;
    int addItem;
    private boolean run;
    private String name;
    private Novice novice;
       
    public Job(){
        run = true;
        input = new Scanner(System.in);
    }
    public void run(){
        System.out.print("\n");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("      Welcome to Game");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.print("\nEnter Your Charector Name : ");
        novice = new Novice(input.nextLine());
        System.out.print("\n");
        System.out.println("Select your job");
        System.out.println("1) Acolyte");
        System.out.println("2) Magician");
        System.out.print("Please Enter : ");
        addjob = input.nextInt();
        
        if(addjob == 1){
            Acolyte acolyte = new Acolyte("Acolyte");
            System.out.println("..Wow, You is Acolyte!!");
        }
        else if(addjob == 2){
            Magician magician = new Magician("Magician");
            System.out.println("..Wow, You is Magician!!");
        }
        while(run){
            System.out.println("\nSelect Menu");
            System.out.println("1) Add Item");
            System.out.println("2) Show Item");
            System.out.println("3) Show info");
            System.out.println("0) Exit");
            System.out.print("Please Enter : ");
            state = input.nextInt();
            System.out.print("\n");
            if(state == 1){
                System.out.println("List of Item");
                System.out.println("1) Water");
                System.out.println("2) Cake");
                System.out.println("3) Drug");
                System.out.print("Please Enter : ");
                addItem = input.nextInt();
                if(addItem == 1){
                    novice.addItem("Water");
                    System.out.println("..You added Water..");
                }
                else if(addItem == 2){
                    novice.addItem("Cake");
                    System.out.println("..You added Cake..");
                }
                else if(addItem == 3){
                    novice.addItem("Drug");
                    System.out.println("..You added Drug..");
                }
            }
            else if(state == 2){
                novice.showItems();
            }
            else if(state == 3){
                if(addjob == 1){
                    novice.acolyteHP(0);
                    novice.allEXP(0);
                    novice.allMANA(0);
                    novice.showInfo();
                }
                else if(addjob == 2){
                    novice.magicianHP(0);
                    novice.allEXP(0);
                    novice.allMANA(0);
                    novice.showInfo();
                }
            }
            else if(state == 0){
                run = false;
                System.out.println("Good Bye!!");
            }
        }
    }
}
       
    