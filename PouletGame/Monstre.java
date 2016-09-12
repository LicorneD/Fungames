
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
		String text2 = "\nReady, FIGHT !!!\n";
		String text3 = "\nChargement du combat...\n";
		System.out.println(text2 + text3);
		try{
			Thread.sleep(3000);
			}catch(InterruptedException e){}
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