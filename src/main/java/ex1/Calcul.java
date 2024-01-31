package ex1;

/**
 * Cette classe fournit des méthodes pour effectuer des opérations de calcul simples.
 * Les opérations comprennent l'addition et la soustraction.
 * 
 * @author Louis-Valentin CHARVET
 */
public class Calcul {

    /**
     * Effectue l'opération d'addition entre deux nombres.
     * 
     * @param a Le premier nombre à additionner.
     * @param b Le deuxième nombre à additionner.
     * @return La somme des deux nombres.
     */
    public int addition(int a, int b) {
        return a + b;
    }

    /**
     * Effectue l'opération de soustraction entre deux nombres.
     * 
     * @param a Le nombre auquel on soustrait.
     * @param b Le nombre à soustraire.
     * @return La différence entre les deux nombres.
     */
    public int soustraction(int a, int b) {
        return a - b;
    }
}
