package ex3;

import java.util.ArrayList;
import java.util.List;

/* Représente un zoo qui héberge des animaux. Les informations des animaux sont
 * stockées dans une liste d'objets Animal.
 * 
 * @author Louis-Valentin CHARVET
 *
 */
public class Zoo {

	private String nom;
	private List<Animal> animaux;

	/**
	 * Constructeur pour créer un zoo avec un nom spécifié.
	 * 
	 * @param nom Le nom du zoo.
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.animaux = new ArrayList<>();
	}

	/**
	 * Ajoute un animal au zoo.
	 * 
	 * @param animal L'objet Animal à ajouter.
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Affiche les informations de tous les animaux du zoo.
	 */
	public void afficherInformationsAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}

	/**
	 * Retourne le nombre d'animaux dans le zoo.
	 * 
	 * @return Le nombre d'animaux.
	 */
	public int taille() {
		return animaux.size();
	}

	/**
	 * Getter for nom
	 * 
	 * @return Le nom du zoo.
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom Le nouveau nom du zoo.
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}