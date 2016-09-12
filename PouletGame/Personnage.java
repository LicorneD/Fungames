// Classe Personnage
public class Personnage{
	String nom;
	int puissance;
	int vie;
	
	//Constructeur
	public Personnage(String pnom){
		nom = pnom;
	}
	
	public String LinkString(){
		String text = "";
				text = "Tu t'appelles donc " + nom;	
			return text;
		}
		
	public int GetPuissance() {
        return puissance;
    }
	 public int GetVie() {
        return vie;
    }
}