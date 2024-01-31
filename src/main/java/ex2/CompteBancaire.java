package ex2;

/**
 * Représente un compte bancaire de type compte courant (type=CC) ou livret A (type=LA).
 * Un compte bancaire peut avoir un solde, un montant de découvert autorisé, et un taux de rémunération annuel.
 * Un livret A ne peut jamais être à découvert.
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

    /** Le solde du compte */
    private double solde;

    /** Le montant de découvert autorisé (0 pour les comptes de type LA) */
    private double decouvert;

    /** Le taux de rémunération annuel du livret A */
    private double tauxRemuneration;

    /** Le type de compte (CC ou LA) */
    private TypeCompte type;

    /**
     * Constructeur pour créer un compte de type compte courant.
     * 
     * @param type Le type de compte (CC ou LA).
     * @param solde Le solde initial du compte.
     * @param decouvert Le montant de découvert autorisé (0 pour les comptes de type LA).
     */
    public CompteBancaire(TypeCompte type, double solde, double decouvert) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Constructeur pour créer un compte de type Livret A.
     * 
     * @param type Le type de compte (CC ou LA).
     * @param solde Le solde initial du compte.
     * @param decouvert Le montant de découvert autorisé (0 pour les comptes de type LA).
     * @param tauxRemuneration Le taux de rémunération annuel du livret A.
     */
    public CompteBancaire(TypeCompte type, double solde, double decouvert, double tauxRemuneration) {
        this(type, solde, decouvert);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Ajoute un montant au solde du compte.
     * 
     * @param montant Le montant à ajouter.
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du solde du compte en fonction du type de compte.
     * 
     * @param montant Le montant à débiter.
     * @throws IllegalArgumentException Si le montant dépasse le découvert autorisé ou le solde du livret A.
     */
    public void debiterMontant(double montant) throws IllegalArgumentException {
        if (type == TypeCompte.CC && montant > solde + decouvert) {
            throw new IllegalArgumentException("Le montant dépasse le découvert autorisé.");
        } else if (type == TypeCompte.LA && montant > solde) {
            throw new IllegalArgumentException("Le montant dépasse le solde du livret A.");
        }

        this.solde -= montant;
    }

    /**
     * Applique la rémunération annuelle au solde du livret A.
     */
    public void appliquerRemuAnnuelle() {
        if (type == TypeCompte.LA) {
            this.solde += solde * tauxRemuneration / 100;
        }
    }

    /**
     * Getter pour le solde du compte.
     * 
     * @return Le solde du compte.
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter pour le solde du compte.
     * 
     * @param solde Le nouveau solde du compte.
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter pour le montant de découvert autorisé.
     * 
     * @return Le montant de découvert autorisé.
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter pour le montant de découvert autorisé.
     * 
     * @param decouvert Le nouveau montant de découvert autorisé.
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Getter pour le taux de rémunération annuel du livret A.
     * 
     * @return Le taux de rémunération annuel du livret A.
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter pour le taux de rémunération annuel du livret A.
     * 
     * @param tauxRemuneration Le nouveau taux de rémunération annuel du livret A.
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Getter pour le type de compte.
     * 
     * @return Le type de compte (CC ou LA).
     */
    public TypeCompte getType() {
        return type;
    }

    /**
     * Setter pour le type de compte.
     * 
     * @param type Le nouveau type de compte (CC ou LA).
     */
    public void setType(TypeCompte type) {
        this.type = type;
    }
}