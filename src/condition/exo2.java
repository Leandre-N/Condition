package condition;
import java.util.Scanner;
public class exo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Saisissez le premier nombre : ");
	    int nombre1 = scanner.nextInt();   
	    System.out.print("Saisissez le deuxième nombre : ");
	    int nombre2 = scanner.nextInt();   
	    System.out.print("Saisissez le troisième nombre : ");
	    int nombre3 = scanner.nextInt();
	    int plusGrand;
	    if (nombre1 >= nombre2 && nombre1 >= nombre3) {
	    	 plusGrand = nombre1;
	    }
	    else if (nombre2 >= nombre1 && nombre2 >= nombre3) {
	    	plusGrand = nombre2;
	    }
	    else {
	    	plusGrand = nombre3;
	    }
	    System.out.println("Le plus grand nombre est : " + plusGrand);
        System.out.println();
        scanner.close();

	}

}
