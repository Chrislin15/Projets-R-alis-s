public abstract class Operation {

    // Initialisation des variable d'instances

    private Nombre Nombre1;
    private Nombre Nombre2;

    public Operation(Nombre Nombre1, Nombre Nombre2) {

        // constructeur champs à champs

        this.Nombre1 = Nombre1;
        this.Nombre2 = Nombre2;
    }

    public abstract int valeur();

    // getters de Nombre1 et de Nombre2

    public Nombre getOPerande1() {

        return this.Nombre1;

    }

    public Nombre getOPerande2() {

        return this.Nombre2;

    }
}