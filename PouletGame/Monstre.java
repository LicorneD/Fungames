// First try for the little Rekwyn

// Monster class
public class Monstre{
	int pv;
	int power;
	String nom;
	
	// Monster constructor
	public Monstre(int xpv, int xpower, String xnom){
		pv = xpv;
		power = xpower;
		nom = xnom;
		}
	
	// Monster appears method
	public void MonsterAppears(){
	String text1 = "Un " + nom + "vient d'apparaître devant vous !";
	String text2 = "";
	if (power >= 10){
		text2 = "... on dirait qu'il veut vous démembrer, il a l'air fort !";
	}
	else{
		text2 = "... et il a une tête de rat crevé ! Le tuer ne posera pas trop de problème...";
	}
	System.out.println(text1 + text2);
	}








}