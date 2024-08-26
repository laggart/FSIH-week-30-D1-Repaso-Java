import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciamos las escuelas
        Escuela escuela1 = new Escuela("IronHack", "Barcelona", 7500.00, true);
        Escuela escuela2 = new Escuela("LeWagon", "Barcelona", 500.00, false);
        Escuela escuela3 = new Escuela("UPC", "Castelldefels", 1500.00, true);

        // Crear un ArrayList de escuelas
        ArrayList<Escuela> listaEscuelas = new ArrayList<>();

        // Añadir las escuelas al ArrayList
        listaEscuelas.add(escuela1);
        listaEscuelas.add(escuela2);
        listaEscuelas.add(escuela3);

        // Imprimir la información de todas las escuelas
        for (Escuela escuela : listaEscuelas) {
            System.out.println(escuela);
        }
    }
}
