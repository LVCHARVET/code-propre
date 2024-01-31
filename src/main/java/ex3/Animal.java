package ex3;

/* Représente un animal avec son nom, son type et son comportement. Les types
 * d'animaux sont définis comme une énumération.
 *  
 * @author Louis-Valentin CHARVET
 */
public class Animal {

	/** Enumération des types d'animaux */
	public enum TypeAnimal {
		MAMMIFERE, POISSON, SERPENT
	}

	/** Enumération des Comportements d'animaux */
	public enum ComportementAnimal {
		HERBIVORE, CARNIVORE, OMNIVORE, AUTRE
	}

	private String nom;
	private TypeAnimal type;
	private ComportementAnimal comportement;

	/**
	 * Constructeur pour créer un animal avec un nom, un type et un comportement.
	 * 
	 * @param nom          Le nom de l'animal.
	 * @param type         Le type de l'animal.
	 * @param comportement Le comportement de l'animal.
	 */
	public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	/**
	 * Retourne une représentation sous forme de chaîne de l'animal.
	 */
	@Override
	public String toString() {
		return nom + " " + type + " " + comportement;
	}
}
