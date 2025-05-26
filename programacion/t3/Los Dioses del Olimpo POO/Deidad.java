public class Deidad {
    private String nombre;
    private String dominio;
    private int poder;
    private int edadEterna;
    private boolean esInmortal;
    private double nivelRespeto;

     // Constructor por defecto
    public Deidad() {
        this.nombre = "Desconocido";
        this.dominio = "Desconocido";
        this.poder = 0;
        this.edadEterna = 0;
        this.esInmortal = true;
        this.nivelRespeto = 0.0;
    }
    
     // Constructor con parámetros
    public Deidad(String nombre, String dominio, int poder, int edadEterna, boolean esInmortal) {
        this.nombre = nombre;
        this.dominio = dominio;
        setPoder(poder); // validación incluida
        setEdadEterna(edadEterna); // validación incluida
        this.esInmortal = esInmortal;
        calcularNivelRespeto();
    }

    // Métodos de acceso (getters y setters)

        // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDominio() {
        return dominio;
    }

    public int getPoder() {
        return poder;
    }

    public int getEdadEterna() {
        return edadEterna;
    }

    public boolean isEsInmortal() {
        return esInmortal;
    }

    public double getNivelRespeto() {
        return nivelRespeto;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public void setPoder(int poder) {
        if (poder >= 0 && poder <= 100) {
            this.poder = poder;
        } else {
            this.poder = 0;
            System.out.println("⚠️ Valor de poder inválido. Se asignó 0 por defecto.");
        }
        calcularNivelRespeto(); // Recalcula al cambiar poder
    }

    public void setEdadEterna(int edadEterna) {
        if (edadEterna >= 0) {
            this.edadEterna = edadEterna;
        } else {
            this.edadEterna = 0;
            System.out.println("⚠️ Edad inválida. Se asignó 0 por defecto.");
        }
        calcularNivelRespeto(); // Recalcula al cambiar edad
    }

    public void setEsInmortal(boolean esInmortal) {
        this.esInmortal = esInmortal;
    }

    // Método para calcular el respeto
    public void calcularNivelRespeto() {
        this.nivelRespeto = (poder * 1.5) + (edadEterna / 10.0);
    }

        // Muestra todos los datos de la deidad por consola
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dominio: " + dominio);
        System.out.println("Poder: " + poder);
        System.out.println("Edad eterna: " + edadEterna + " años");
        System.out.println("¿Es inmortal?: " + (esInmortal ? "Sí" : "No"));
        System.out.printf("Nivel de respeto: %.2f\n", nivelRespeto);
    }

    // Descripción breve
    @Override
    public String toString() {
        return nombre + " (Dominio: " + dominio + ", Poder: " + poder + ", Respeto: " + String.format("%.1f", nivelRespeto) + ")";
    }

    // Promocionar si cumple condiciones
    public void promocionar() {
        if (poder >= 80 && edadEterna < 500) {
            poder = Math.min(100, (int)(poder * 1.10)); // No supera 100
            calcularNivelRespeto();
            System.out.println(nombre + " ha sido promovido. Nuevo poder: " + poder);
        } else {
            System.out.println(nombre + " no cumple los requisitos para promoción.");
        }
    }

    // Determinar si es antigua
    public boolean esAntiguo() {
        return edadEterna > 1000;
    }

    // Convertirse en leyenda
    public void convertirseEnLeyenda() {
        if (nivelRespeto > 200) {
            esInmortal = false;
            poder = 0;
            calcularNivelRespeto();
            System.out.println(nombre + " se ha convertido en una leyenda.");
        }
    }

    // Modificar el poder con control de límites
    public void actualizarPoder(int modificador) {
        poder += modificador;
        if (poder < 0) poder = 0;
        if (poder > 100) poder = 100;
        calcularNivelRespeto();
    }

    // Comparar respeto con otra deidad
    public Deidad compararRespeto(Deidad otra) {
        return this.nivelRespeto >= otra.nivelRespeto ? this : otra;
    }

    // Título honorífico según dominio y poder
    public String mostrarTituloHonorifico() {
        if (dominio.equalsIgnoreCase("guerra") && poder > 90) {
            return "El Invencible";
        } else if (dominio.equalsIgnoreCase("mar") && poder <= 90) {
            return "Guardián del Océano";
        } else if (dominio.equalsIgnoreCase("sabiduría") && poder >= 85) {
            return "La Iluminada";
        } else {
            return "Deidad del " + dominio;
        }
    }


    
}