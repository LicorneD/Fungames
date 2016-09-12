import java.util.Scanner; 


class PouletGame {
   public static void main (String[] args){
	String sexe = "H";
    System.out.println("Welcome in PouletGame !\n\n");
	System.out.println("Homme(H) ou Femme(F) ?");

	Scanner sc2 = new Scanner(System.in); 
	sexe = sc2.next();
	
	while( !"H".equals(sexe)  && !"h".equals(sexe) && !"F".equals(sexe) && !"f".equals(sexe)){
		sc2 = new Scanner(System.in); 
		sexe = sc2.next();
	}
	
	System.out.println("Quel est votre nom de personnage ?");
	Scanner sc1 = new Scanner(System.in); 
	String nom = sc1.next();
	
	Poule heros = new Poule(nom);
	heros.LinkString();
   }
}