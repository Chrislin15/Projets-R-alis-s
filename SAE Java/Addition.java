public class Addition extends Operation {

    public Addition(Nombre Nombre1, Nombre Nombre2) {

        // Initialisation des variables d'instances via la classe "Opération"
        super(Nombre1, Nombre2);
    }

    public int valeur() {

        int a = this.getOPerande1().valeur(); // on récupère la 1ère valeur, grâce au getters de "Operande1"
        int b = this.getOPerande2().valeur(); // on récupère la 2e valeur, grâce au getters de "Operande2"
        int c = a + b; // on additionne les variables "a" et "b", et on stocke le résultat dans la
                       // variable "c"
        return c;

    }

    public String toString() {

        return "(" + this.getOPerande1() + "+" + this.getOPerande2() + ")";
    }

}