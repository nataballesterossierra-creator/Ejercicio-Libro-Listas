import javax.print.attribute.standard.PresentationDirection;

public class Libro {

    private String Titulo;
    private String Autor;
    private int cantDisponible;
    private String Estado;

    public Libro() {
    }


    public Libro(String titulo, String autor, int cantDisponible) {
        Titulo = titulo;
        Autor = autor;
        this.cantDisponible = cantDisponible;
        actualizarEstado();
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", cantDisponible=" + cantDisponible +
                ", Estado='" + Estado + '\'' +
                '}';
    }

    //Metodos

    public void mostrarInfo (){
        System.out.println("  Titulo:  "+this.getTitulo());
        System.out.println("  Autor:  "+this.getAutor());
        System.out.println("  Cantidad Disponible: "+ this.getCantDisponible());
        System.out.println("  Estado: "+this.getEstado());

    }

    public void agregarCopias(int cantidad){
        if (cantidad <= 0){
            System.out.println("Ingresar una cantidad correcta");
            return;
        }
        this.cantDisponible += cantidad;
        actualizarEstado();
    }


    public boolean consultarDisponibilidad(int cantSolicitada){
        
        return cantSolicitada > 0 && cantDisponible >= cantSolicitada;
        
    }
    
    public boolean prestarLibro(int cantSolicitada){
        if (consultarDisponibilidad(cantSolicitada)){
            cantDisponible -= cantSolicitada;
            actualizarEstado();
            return true;
        }
        return false;
    }

    private void actualizarEstado() {

        setEstado(this.cantDisponible > 0 ? "Disponible": "Prestado");
    }


}
