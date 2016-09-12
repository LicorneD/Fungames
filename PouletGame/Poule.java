// Classe Poule
public class Poule extends Personnage{
	int puissance;
	int vie;

	
	//Constructeur
	public Poule(String pnom){
		super(pnom);
		puissance = (int)(Math.random() * (30 - 10) + 10);
		vie = (int)(Math.random() * (50 - 20) + 20);
	}

	
	public String LinkString(){
		String text = "";
				text = super.LinkString() + ", tu es une poule ayant " + puissance + " de puissance et " + vie + " pv";	
				System.out.println(text);
			return text;
		}
	
	
}