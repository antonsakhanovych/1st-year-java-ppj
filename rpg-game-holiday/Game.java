import java.nio.file.Path;
import java.util.Scanner;

public class Game {
    private Character[] path = new Character[0];
    private Player you;
    private Character attacker;

    private Character encounteredChar;

    private boolean gameOn = true;

    public void setupGame(){
        Inventory yourInv = Inventory.createYourInventory();
        Player you = Player.createYouCharacter(yourInv);
        this.you = you;
        this.attacker = you;
    }

    protected void addToPath(Character character){
        int prevLength = this.path.length;
        Character[] newCharArr = new Character[prevLength + 1];
        newCharArr[prevLength] = character;
        if (prevLength != 0){
            System.arraycopy(this.path, 0, newCharArr, 0, prevLength);
        }
        this.path = newCharArr;
    }

    protected void createRandomPath(){
        for (int i = 0; i < 10 ; i++) {
            double randNum = Math.random();
            if(randNum > 0.4){
                addToPath(Monster.createRandomMonster());
            } else {
                addToPath(Ally.createRandomAlly());
            }
        }
    }

    protected void returnToYou(){
        this.attacker = this.you;
    }

    protected void recheckGameCond(){
        this.gameOn = this.path.length > 0 && ((this.you.isAlive() && this.you.hasWeapons()) || this.you.hasTeam());
    }

    protected void showPath(){
        for(Character cha : this.path){
            System.out.println(cha);
        }
    }

    protected void removeFromPath(Character character){
        int count = 0;
        int prevLength = this.path.length;
        Character[] newPath = new Character[prevLength - 1];
        for(Character cha : this.path){
            if(cha == character){
                continue;
            }
            newPath[count] = cha;
            count++;
        }
        this.path = newPath;
    }

    protected boolean facingMonster(){
        if(this.encounteredChar instanceof Monster){
            System.out.println("You encountered a monster");
            System.out.println("You have to fight him or call for help!");
            System.out.println();
            return true;
        }
        if(this. encounteredChar instanceof Ally){
            System.out.println("You encountered an ally!");
            System.out.println("He will be added to your team! You can call him for help later!");
            System.out.println();
            return false;
        }
        return false;
    }

    protected void playRound(){
        Scanner scan = new Scanner(System.in);
        boolean haveBattled = false;
        this.you.tryUpgrade();
        int num = -1;
        while((num < 1 || num > 2) && !haveBattled ){
            if(this.attacker.isAlive()) {
                System.out.println("1 - Attack");
            }
            if(this.you.hasTeam()) {
                System.out.println("2 - Call for help");
            }
            System.out.println("3 - See your stats");
            System.out.println();
            System.out.println("Choose the option");
            num = scan.nextInt();
            switch (num){
                case 1 -> {
                    if (this.attacker.isAlive()){
                        this.battle();
                        haveBattled = true;
                    } else {
                        System.out.println("You cannot attack! Call for help!");
                    }
                }
                case 2 -> {
                    if(this.you.hasTeam()){
                        this.attacker = this.you.callForHelp();
                    }
                }
                case 3 -> {
                    this.you.showStats();
                }
            }
        }

    }

    protected void battle(){
        System.out.println("Your stats: ");
        this.attacker.showStats();
        System.out.println();
        System.out.println("Monster stats: ");
        this.encounteredChar.showStats();
        System.out.println();
        System.out.println("You attack first!");
        System.out.println();
        Weapon chosenWeapon = this.attacker.chooseWeapon();
        this.attacker.attack(chosenWeapon, this.encounteredChar);
        if(!this.encounteredChar.isAlive()){
            System.out.println("You won!");
            this.you.lootEnemy(this.encounteredChar);
            this.you.addExp((Monster) this.encounteredChar);
            return;
        }
        Weapon monstWeapon = this.encounteredChar.chooseWeapon();
        this.encounteredChar.attack(monstWeapon, this.attacker);
        this.you.recheckTeam();
        this.returnToYou();
    }
    protected void next(){
        Character nextChar = this.path[0];
        this.encounteredChar = nextChar;
        this.removeFromPath(nextChar);
        System.out.println("Moving to the next character!");
    }



    public static void main(String[] args) throws InterruptedException {
        // init

        Game game = new Game();
        // setup
        game.setupGame();
        game.you.showStats();
        game.createRandomPath();
        // gameLoop
        while(game.gameOn){
            game.next();
            boolean isMonster = game.facingMonster();
            while(isMonster && game.encounteredChar.isAlive() && game.you.isAlive() && game.encounteredChar.isAlive()){
                game.playRound();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println();
                }
            }
            if(!isMonster){
                game.you.addToTeam((Ally) game.encounteredChar);
            }
            game.recheckGameCond();
        }
        if(game.you.isAlive() && game.path.length == 0){
            System.out.println("Congrats you won!");
        } else if (!game.you.isAlive()){
            System.out.println("You were killed!");
        }
    }
}
