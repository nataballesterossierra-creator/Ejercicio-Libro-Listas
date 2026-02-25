import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        Libro l1 = new Libro(" Psicologia Oscura", "Fabian Goleman",5);
        l1.mostrarInfo();
        l1.agregarCopias(12);
        l1.mostrarInfo();
        System.out.println("se pueden prestar 17 ejemplares");
        l1.prestarLibro(15);
        System.out.println("Fueron prestados 15 ejemplares");
        l1.mostrarInfo();

        /// /////   ////   // /
        System.out.println("Bienvenido al sistema de la Biblioteca");
        System.out.println("");
        System.out.println(" Ingrese el nombre del Libro: ");
        String Titulo = teclado.nextLine();
        System.out.println("");
        System.out.println(" Ingrese el nombre del autor del libro: ");
        String Autor = teclado.nextLine();
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de ejemplares: ");
        int cantDisponibles = teclado.nextInt();
       






    }
}