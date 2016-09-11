// Classe Personnage
public class Personnage{
	int sexe;
	String nom;

	
	//Constructeur
	public Personnage(int psexe, String pnom){
		sexe = psexe;
		nom = pnom;
	}

	
	public void LinkString(){
		String text = "";
			if (sexe >= 1){
				text = "Je m'appelle " + nom + " et je suis un homme."; 	
			}
			else {
				text = "Je m'appelle " + nom + " et je suis une femme."; 
			}
			System.out.println(text);
		}
	
	
}