
// Classe Coc
public class Coc extends Personnage{

	
	//Constructeur
	public Coc(String pnom){
		super(pnom);
		puissance = (int)(Math.random() * (30 - 10) + 10);
		vie = (int)(Math.random() * (60 - 20) + 20);
	}

	
	public String LinkString(){
		String text = "";
				text = super.LinkString() + ", tu es un coc ayant " + puissance + " de puissance et " + vie + " pv";	
				System.out.println(text);
			return text;
		}
    }
	