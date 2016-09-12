import java.util.Scanner; 


class PouletGame {
   public static void main (String[] args){
	String sexe = "H";
	int type;
    System.out.println("Welcome in PouletGame !\n\n");
	System.out.println("Homme(H) ou Femme(F) ?");

	Scanner sc2 = new Scanner(System.in); 
	sexe = sc2.next();
	
	while( !"H".equals(sexe)  && !"h".equals(sexe) && !"F".equals(sexe) && !"f".equals(sexe)){
		sc2 = new Scanner(System.in); 
		sexe = sc2.next();
	}
	
	if (sexe.equals("H") || sexe.equals("h")){
		type = 1;
	}
	else{
		type = 2;
	}
	
	System.out.println("Quel est votre nom de personnage ?");
	Scanner sc1 = new Scanner(System.in); 
	String nom = sc1.next();
	
	if(type == 2){
	Poule heros = new Poule(nom);
	heros.LinkString();
	}
	if(type == 1){
	Coc heros = new Coc(nom);
	heros.LinkString();
	}
<<<<<<< HEAD
	Renard r1 = new Renard("RenardzerVener");
	r1.OmgUnMonstre();
	r1.Danger();
	
	//PHASE COMBAT
	
	System.out.println("Le combat commence !\n\n");
	while (renard.xpv != 0 || heros.vie != 0){
		
	}
   }
}