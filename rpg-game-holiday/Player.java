import java.util.Scanner;

public class Player extends Character{
    private Ally[] team = {};
    private int exp;
    public Player(int health, int mana, int stamina, Inventory inventory) {
        super(health, mana, stamina, inventory);
        if ((health + mana + stamina) != 15) {
            throw new IllegalArgumentException("Wrong number of points!");
        }
        this.exp = 0;
    }

    public boolean hasTeam(){
        return this.team.length > 0;
    }


    public void recheckTeam(){
        Ally[] copyTeam = this.team.clone();
        for(Ally al : copyTeam){
            if(!al.isAlive()){
                this.removeAlly(al);
            }
        }

    }
    protected void removeAlly(Ally ally){
        int prevLength = this.team.length;
        Ally[] newTeam = new Ally[prevLength - 1];
        int count = 0;
        for(Ally al : this.team){
            if(al == ally){
                continue;
            }
            newTeam[count] = al;
            count++;
        }
        this.team = newTeam;
    }

    public void tryUpgrade(){
        if(!(this.exp >= 5)){
            return;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("You have " + this.exp + "! You can upgrade any of your stats by 5! It will cost you 5 exp.");
        System.out.println("1 - Health");
        System.out.println("2 - Stamina");
        System.out.println("3 - Mana");
        int num = -1;
        while(!(num == 1 || num == 2 || num == 3)){
            System.out.println("Enter number: ");
            num = scan.nextInt();
        }
        switch(num){
            case 1 -> {
                int prevHealth = this.stats.get("health");
                this.stats.replace("health", prevHealth + 5);
                this.exp -= 5;
            }
            case 2 -> {
                int prevStamina = this.stats.get("stamina");
                this.stats.replace("stamina", prevStamina + 5);
                this.exp -= 5;
            }
            case 3 -> {
                int prevMana = this.stats.get("mana");
                this.stats.replace("mana", prevMana + 5);
                this.exp -= 5;
            }
        }
    }

    public Ally callForHelp(){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < this.team.length; i++){
            System.out.println(i + ") ");
            this.team[i].showStats();
        }
        int choice = -1;
        while(choice < 0 || choice >= this.team.length){
            System.out.println("Choose your help! Type from 0 to " + (this.team.length - 1));
            choice = scan.nextInt();
        }
        return this.team[choice];
    }

    public void addExp(Monster enemy){
        this.exp += enemy.expToGive();
    }

    @Override
    public void showStats(){
        super.showStats();
        System.out.println("EXP: " + this.exp);
    }

    public void addToTeam(Ally ally){
        int prevLength = this.team.length;
        Ally[] newTeam = new Ally[prevLength + 1];
        newTeam[prevLength] = ally;
        if(prevLength != 0){
            System.arraycopy(this.team, 0, newTeam, 0, prevLength);
        }
        this.team = newTeam;
    }

    public static Player createYouCharacter(Inventory yourInv){
        Scanner scan = new Scanner(System.in);
        int pointsToChooseFrom;
        int health = 0;
        int stamina = 0;
        int mana = 0;
        // get input from the user
        System.out.println("Enter points for health and stamina! Rest of the points will be assigned to the mana");
        System.out.println("Sum of the points has to be 15, so do not enter negative numbers!");
        while(health < 1 || stamina < 1 || mana < 1){
            System.out.println("All stats has to be grater than at least 1!");
            System.out.println();
            pointsToChooseFrom = 15;
            System.out.println("Points to use : " + pointsToChooseFrom + " Enter health points: ");
            health = scan.nextInt();
            pointsToChooseFrom -= health;
            System.out.println("Points to use : " + pointsToChooseFrom + " Enter stamina points: ");
            stamina = scan.nextInt();
            pointsToChooseFrom -= stamina;
            mana = pointsToChooseFrom;
        }
        return new Player(health, mana, stamina, yourInv);
    }
}
