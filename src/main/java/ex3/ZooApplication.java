package ex3;

/* Application de test pour le zoo. Crée un zoo, ajoute des animaux et affiche
 * leurs informations.
 * 
 * 
 * @author Louis-Valentin CHARVET
 *
 */
public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Gazelle", Animal.TypeAnimal.MAMMIFERE, Animal.ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", Animal.TypeAnimal.MAMMIFERE, Animal.ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", Animal.TypeAnimal.MAMMIFERE, Animal.ComportementAnimal.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", Animal.TypeAnimal.MAMMIFERE, Animal.ComportementAnimal.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Animal.TypeAnimal.POISSON, Animal.ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", Animal.TypeAnimal.POISSON, Animal.ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", Animal.TypeAnimal.SERPENT, Animal.ComportementAnimal.CARNIVORE));
		zoo.addAnimal(new Animal("Python", Animal.TypeAnimal.SERPENT, Animal.ComportementAnimal.CARNIVORE));

		// Afficher les informations des animaux dans le zoo
		zoo.afficherInformationsAnimaux();
	}
}