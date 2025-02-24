public class Arma {
    public String name;
    public String category;
    public String color;
    public double alcance;
    public int cadencia;
    public int danio;
    public String empuniadura;
    public boolean equipada;

    public Arma(String name, String category, String color, double alcance, int cadencia, int danio, String empuniadura, boolean equipada){
        this.name = name;
        this.category = category;
        this.color = color;
        this.alcance = alcance;
        this.cadencia = cadencia;
        this.danio = danio;
        this.empuniadura = empuniadura;
        this.equipada = equipada;
    }

    public Arma(String name, int damage){

        this(name, damage, 0, 0, null, false);
    }

    public (String )
}