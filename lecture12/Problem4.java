//Author: Anton Sakhanovych
//ESKA: s26776
import java.util.Scanner;

public class Problem4{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	String[][] arr ={ {"Kenya",  "Nairobi"},
			  {"Rwanda", "Kigali"},
			  {"Gambia", "Banjul"},
			  {"Ghana",  "Accra"},
			  {"Niger",  "Niamey"},
			  {"Zambia", "Lusaka"}};
	
	System.out.println("Enter name of a country: ");
	String country = scan.nextLine();
	String capital = "";
	for(String[] el : arr){
	    if(country.equalsIgnoreCase(el[0])){
	        capital = el[1];
		break;
	    }
	}
	if(!capital.equals("")){
	    System.out.println("Capital of a specified country is " + capital);
	} else {
	    System.out.println("Country name cannot be found");
	}
    }
}
