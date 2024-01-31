package ex2;

/**
 * Représente un compte bancaire de type Livret A, qui est une sous-classe de
 * CompteBancaire. Un Livret A ne peut jamais être à découvert.
 * 
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {

	/** Constante utilisé dans les calcul de poucentage */
	private static final int CENT_POURCENT = 100;
	
	/** Le taux de rémunération annuel du Livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur pour créer un compte de type Livret A.
	 * 
	 * @param solde            Le solde initial du compte.
	 * @param tauxRemuneration Le taux de rémunération annuel du livret A.
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(TypeCompte.LA, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Applique la rémunération annuelle au solde du livret A.
	 */
	@Override
	public void appliquerRemuAnnuelle() {
		this.setSolde(getSolde() + getSolde() * tauxRemuneration / CENT_POURCENT);
	}

	/**
	 * Getter pour le taux de rémunération annuel du Livret A.
	 * 
	 * @return Le taux de rémunération annuel du livret A.
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter pour le taux de rémunération annuel du Livret A.
	 * 
	 * @param tauxRemuneration Le nouveau taux de rémunération annuel du livret A.
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}