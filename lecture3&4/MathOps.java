import java.util.Scanner;

public class MathOps {
    public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter type(int, real, char): ");
    String numType = scan.nextLine();
    
    switch(numType){
        case "int":
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scan.nextLine());
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scan.nextLine());
            System.out.println("Adding integers: ");
            int result = num1 + num2;
            System.out.println(String.format("%s + %s = %s",num1, num2, result));
            System.out.println("Subtracting integers: ");
            result = num1 - num2;
            System.out.println(String.format("%s - %s = %s",num1, num2, result));
            System.out.println("Multiplying integers: ");
            result = num1 * num2;
            System.out.println(String.format("%s * %s = %s",num1, num2, result));
            System.out.println("Dividing integers: ");
            result = num1 / num2;
            System.out.println(String.format("%s / %s = %s",num1, num2, result));
            System.out.println("Finding the remainder in integers: ");
            result = num1 % num2;
            System.out.println(String.format("%s mod %s = %s",num1, num2, result));
            break;
            case "real":
            System.out.print("Enter first number: ");
            double rnum1 = Double.parseDouble(scan.nextLine());
            System.out.print("Enter second number: ");
            double rnum2 = Double.parseDouble(scan.nextLine());
            System.out.println("Adding integers: ");
            double rresult = rnum1 + rnum2;
            System.out.println(String.format("%s + %s = %s",rnum1, rnum2, rresult));
            System.out.println("Subtracting integers: ");
            rresult = rnum1 - rnum2;
            System.out.println(String.format("%s - %s = %s",rnum1, rnum2, rresult));
            System.out.println("Multiplying integers: ");
            rresult = rnum1 * rnum2;
            System.out.println(String.format("%s * %s = %s",rnum1, rnum2, rresult));
            System.out.println("Dividing integers: ");
            rresult = rnum1 / rnum2;
            System.out.println(String.format("%s / %s = %s",rnum1, rnum2, rresult));
            System.out.println("Finding the remainder in integers: ");
            rresult = rnum1 % rnum2;
            System.out.println(String.format("%s mod %s = %s",rnum1, rnum2, rresult));
            break;
            case "char":
            System.out.print("Enter first character: ");
            char char1 = scan.nextLine().charAt(0);
            System.out.print("Enter second character: ");
            char char2 = scan.nextLine().charAt(0);
            System.out.println("Adding character: ");
            int cresult = char1 + char2;
            System.out.println(String.format("%s + %s = %s",char1, char2, cresult));
            System.out.println("Subtracting character: ");
            cresult = char1 - char2;
            System.out.println(String.format("%s - %s = %s",char1, char2, cresult));
            System.out.println("Multiplying character: ");
            cresult = char1 * char2;
            System.out.println(String.format("%s * %s = %s",char1, char2, cresult));
            System.out.println("Dividing character: ");
            cresult = char1 / char2;
            System.out.println(String.format("%s / %s = %s",char1, char2, cresult));
            System.out.println("Finding the remainder in character: ");
            cresult = char1 % char2;
            System.out.println(String.format("%s mod %s = %s",char1, char2, cresult));
            break;
    }
    scan.close();
    }
}

