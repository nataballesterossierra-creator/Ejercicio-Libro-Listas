import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" /// //// //// ////");
        Libro l1 = new Libro(" Psicologia Oscura", "Fabian Goleman",5);
        l1.mostrarInfo();
        l1.agregarCopias(12);
        l1.mostrarInfo();
        System.out.println("se pueden prestar 17 ejemplares");
        l1.prestarLibro(15);
        System.out.println("Fueron prestados 15 ejemplares");
        l1.mostrarInfo();

        /// /////   ////   // /

        System.out.println(" ");
        System.out.println("    Bienvenido al sistema de la Biblioteca        ");
        System.out.println("");
        System.out.println(" Ingrese el nombre del Libro: ");
        String titulo = teclado.nextLine();
        System.out.println("");
        System.out.println(" Ingrese el nombre del autor del libro: ");
        String autor = teclado.nextLine();
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de ejemplares: ");
        int cantDisponibles = teclado.nextInt();
        teclado.nextLine();
        Libro libro = new Libro (titulo,autor,cantDisponibles);
        libro.mostrarInfo();
        System.out.println(" Ingresa la cantidad de Libros que deseas adquirir prestados: ");
        int canSolicitada = teclado.nextInt();
        teclado.nextLine();

        boolean prestado = libro.prestarLibro(canSolicitada);
        if (prestado) {
            System.out.println(" Fueron prestados " + canSolicitada + " libros .");
        } else {
            System.out.println(" Cantidad solicitada inválida o no hay suficientes copias. ");
        }
        System.out.println("");
        System.out.println("/_/_/_/_/_/_/_/_/_/_/_/");
        libro.mostrarInfo();

        System.out.println("");
        System.out.println(" Thanks for using  the system");
        System.out.println("      +++++         +++++");
        System.out.println(" ");
        System.out.println("           !_______!     ");













    }
}