// Classe Personnage
public class Personnage{
	String nom;

	
	//Constructeur
	public Personnage(String pnom){
		nom = pnom;
	}
	
	public String LinkString(){
		String text = "";
				text = "Tu t'appelles donc " + nom;	
			return text;
		}
}