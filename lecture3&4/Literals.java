import java.util.Scanner;
public class Literals{
    public static String convertToOctal(int decimal){    
        int rem;
        String octal="";
        char octalchars[]={'0','1','2','3','4','5','6','7'};  
        while(decimal>0)  
        {  
           rem=decimal%8;   
           octal=octalchars[rem]+octal;   
           decimal=decimal/8;  
        }  
        return octal;  
    }    
    public static void main (String args[]){
        // print out every possible literal of logical values
        System.out.println("------------------------");
        System.out.println("True logical literal value: " + true);
        System.out.println("False logical literal value: " + false);
        System.out.println("------------------------");
        // print out same number in different representations
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scan.nextLine());
         
        String numBin = Integer.toBinaryString(num);
        String numHex = Integer.toHexString(num);
        String numOct = convertToOctal(num);
        double realNum = 13.212;
        char cha1 = 'q';
        char cha2 = '\u0071';
        System.out.println("------------------------");
        System.out.println("Decimal number: " + num);
        System.out.println("Binary number: " + numBin);
        System.out.println("Hexadecimal number: " + numHex);
        System.out.println("Octal number: " + numOct);
        System.out.println("------------------------");
        System.out.println("Real number: " + realNum);
        System.out.println("------------------------");
        System.out.println("Usual character: " + cha1);
        System.out.println("Character in unicode: " + cha2);
        scan.close();
    }
}