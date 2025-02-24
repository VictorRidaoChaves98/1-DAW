public class Constructores {
    public static void main(String[] args) {
        Arma arma1 = new Arma("AK-47", "Epica", "verde", 43.5, 4, 50, "Básica", true);
        Arma arma2 = new Arma("MP-7", "Normal", "Gris", 25.8, 7, 70, "Básica", true);

        if(arma1.danio > arma2.danio){
            System.out.println(arma1.name + " tiene más daño que " + arma2.name);
        }else{
            System.out.println(arma2.name + " tiene más daño que " + arma1.name);
        }
    }
}