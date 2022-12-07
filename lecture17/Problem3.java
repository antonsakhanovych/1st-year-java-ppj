import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Child[] children = {new Child("Bob"), new Child("Jane"), new Child("Kate")};
	for(int i = 0; i < children.length; i++){
            System.out.println("Name of the child no " + i + ": " + children[i].name);
        }
        Child.printChildren(children);
	
        System.out.println("Entering the name of the'giver' starting with 'q' terminates the program");

        System.out.println("Enter names of'giver'and'receiver':");
        String input = scan.nextLine();
        char exit = input.charAt(0);
        while (exit != 'q'){
            String[] splitted = input.split("\\s+");

            Child ch1 = Child.getChildByName(children, splitted[0]);
            Child ch2 = Child.getChildByName(children, splitted[1]);
	    if(ch1 != null && ch2 != null){
		ch1.givesCandyTo(ch2);
		Child.printChildren(children);
	    } else {
		String name = ch1 == null ? splitted[0] : splitted[1];
		System.out.println("No child with name " + name);
	    }
	    
            System.out.println("Enter names of'giver'and'receiver':");
            input = scan.nextLine();
            exit = input.charAt(0);
        }
    }
}
