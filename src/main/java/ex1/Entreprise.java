package ex1;

import java.time.LocalDate;

/**
 * @author Louis-Valentin CHARVET
 *
 */
public class Entreprise {

	/** siret */
	private int siret;
	/** nom */
	private String nom;
	/** adresse */
	private String adresse;
	/** dateCreation */
	private LocalDate dateCreation;

	/** CAPITAL_MAX */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Constructeur
	 * 
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, LocalDate dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	// Getters et setters
	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * Méthode pour afficher le statut
	 */
	public void afficherStatut() {
		// Implémentez le code pour afficher le statut ici
	}
}
