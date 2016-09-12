
import java.util.Scanner; 


class PouletGame {
   public static void main (String[] args){
	String sexe = "H";
	int type;
    System.out.println("\nBienvenue dans le monde de PouletGame !\n\nIncarnez une poule ou un coq, et detruisez vos ennemis !\nBonne chance, brave paysan, aventure et gloire vous attendent !\n\n");
	System.out.println("Etes-vous un Homme(H) ou une Femme(F) ?");

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
	System.out.println("\nComment souhaitez-vous vous appeler ?");
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
	Coc heros = new Coc(nom);
	System.out.println("\nCe nom convient tres bien pour aller botter les fesses de tes adversaires !");
	
	System.out.println("Ton premier combat est sur le point de commencer !\nUn renard tout pourri veut ta mort, defends-toi !");
	Renard r1 = new Renard("Renard fripon");
	r1.OmgUnMonstre();
	r1.Danger();
	
	//PHASE COMBAT
	
	while (r1.vie != 0 && heros.vie != 0){
		heros.herosattaque(r1, heros);
		r1.monstreattaque(r1, heros);
	}
	
	r1.WinLose(r1, heros);
	
   }
}