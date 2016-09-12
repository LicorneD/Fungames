

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
	
		public void monstreattaque(Monstre m, Personnage p){
			p.vie = p.vie - m.puissance;
			if (p.vie < 0){
				p.vie = 0;
			}
		System.out.println("Vous subissez "+m.puissance+ "degats, il vous reste "+p.vie+"pv !\n");
	}
	
	public void herosattaque(Monstre m, Personnage p){
		int vie = m.vie - p.puissance;
		m.vie = vie;
		if (m.vie < 0){
				m.vie = 0;
			}
		System.out.println("Vous faites un total de "+p.puissance+ " degats, il reste "+vie+" pv  l'ennemi.\n");
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