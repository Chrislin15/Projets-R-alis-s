public class Nombre extends Expression {


    // Initialisation des variables d'instances
    private int valeurNombre;

    public Nombre(int valeurNombre, double valeur) {

        // constructeur champ à champ
        super(valeur);
        this.valeurNombre = valeurNombre;

    }

    public String toString() {

        String r = " ";
        return r;

    }

    public double valeur() {

        return valeurNombre;

    }

}
