package condition;

public class exo3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez saisir un âge : ");
        int age = scanner.nextInt();
        if (age < 12) {
            System.out.println("Catégorie : Enfant");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Catégorie : Adolescent");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Catégorie : Adulte");
        } else {
            System.out.println("Catégorie : Senior");
        }
        scanner.close();
        }
	}
