// Premier essai du petit Rekwyn

// Classe monstre
public class Monstre{
	String nom;
	int puissance;
	int vie;
	
	// Constructeur
	public Monstre(String xnom){
		nom = xnom;
		}
	
	// Apparition d'un monstre 
	public String OmgUnMonstre(){
	String text1 = nom;
	return text1;
	}

	// Apparition du monstre - renard
	public void Danger(){
		String text2 = "";
		if (puissance >= 15){
			 text2 = "\nFais gaffe a ton cul, il a l'air vnr !!";
		} 
		else{
			 text2 = "\nTu devrais avoir aucun mal a lui casser le cul...";
		}
		String text3 = "\nReady, FIGHT !!!";
		System.out.println(text2 + text3);
	}






}