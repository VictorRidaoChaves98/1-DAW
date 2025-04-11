public class Entrenador extends Participante{
    
    private Boxeador boxeador;

    public Entrenador(String nombre, int edad, Boxeador boxeador) {
        super(nombre, edad);
        this.boxeador = boxeador;
    }

    public Boxeador getBoxeador() {
        return boxeador;
    }

    public void setBoxeador(Boxeador boxeador) {
        this.boxeador = boxeador;
    }

    public void motivar(Boxeador boxeador){
        System.out.println("O ganas o estás despedido!!");

    }

    @Override
    public String toString() {
        return "Entrenador [boxeador=" + boxeador + "]";
    }

    @Override
    public void presentarse() {
        System.out.println("Soy" + getNombre() + " y soy el entrenador de: " + getBoxeador());
    }

    
    
}
