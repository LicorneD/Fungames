
// Classe Combat
public class Combat{
	int vie;
	
	public void WinLose(Monstre m, Personnage p){
		if (p.vie == 0){
			System.out.println("T'es mort pauvre piaf.");
		}
		if (m.vie == 0){
			System.out.println("Bravo ! " + m.nom + " est mort !");
		}
		
	}
	
	public void herosattaque(Monstre m, Personnage p){
		m.vie = m.puissance - p.puissance;
		if (m.vie < 0){
				m.vie = 0;
			}
		// Winlose(m, p);
	}
	
	public void monstreattaque(Monstre m, Personnage p){
			p.vie = p.vie - m.puissance;
			if (p.vie < 0){
				p.vie = 0;
			}
		// Winlose(m, p);
	}

}