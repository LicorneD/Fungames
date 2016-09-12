

// Deuxieme essai

// Classe renard
public class Renard extends Monstre{

	// Constructeur
	public Renard(String xnom){
	super(xnom);
	puissance = (int)(Math.random() * (20-10) + 10);
	vie = (int)(Math.random() * (20-10) + 10);
	}

	public String OmgUnMonstre(){
	String text1 = super.OmgUnMonstre() + " est apparu devant vous, c'est un renard de puissance de " + puissance + "et avec" + vie + "pv";
	System.out.println(text1);
	return text1;
	}
}



