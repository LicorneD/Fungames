import java.util.Scanner; 


class PouletGame {
   public static void main (String[] args){
    System.out.println("Welcome in PouletGame !\n\n");

	
	System.out.println("Quel est votre nom de personnage ?");
	
	Scanner sc1 = new Scanner(System.in); 
	String nom = sc1.next();
	
	Poule heros = new Poule(nom);
	heros.LinkString();
   }
}