import java.util.Scanner; 


class PouletGame {
   public static void main (String[] args){
    System.out.println("Welcome in PouletGame !\n\nEtes-vous un homme(1) ou une femme(0) ?");
	
	Scanner sc1 = new Scanner(System.in); 
	int sexe = sc1.nextInt(); 
	
	System.out.println("Quel est votre nom de personnage ?");
	
	Scanner sc2 = new Scanner(System.in); 
	String nom = sc2.next();
	
	Personnage heros = new Personnage(sexe, nom);
	heros.LinkString();
	// Bite
   }
}