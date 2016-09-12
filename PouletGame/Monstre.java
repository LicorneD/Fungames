
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
	
	public void herosattaque(Monstre m, Personnage p){
		m.vie = m.vie - p.puissance;
		if (m.vie < 0){
				m.vie = 0;
			}
		System.out.println("Vous faites un total de "+p.puissance+ " degats, il reste "+m.vie+" pv a l'ennemi.\n");
	}
	
		public void monstreattaque(Monstre m, Personnage p){
			p.vie = p.vie - m.puissance;
			if (p.vie < 0){
				p.vie = 0;
			}
		System.out.println("Vous subissez "+m.puissance+ "degats, il vous reste "+p.vie+"pv !\n");
	}
	
		public void WinLose(Monstre m, Personnage p){
		if (p.vie == 0){
			System.out.println("T'es mort pauvre piaf.");
		}
		if (m.vie == 0){
			System.out.println("Bravo ! " + m.nom + " est mort !");
		}
		
	}






}