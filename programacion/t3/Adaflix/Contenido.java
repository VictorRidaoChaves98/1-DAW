public abstract class Contenido {
    protected String titulo;
    protected int visualizaciones;

    public Contenido(String titulo) {
        this.titulo = titulo;
        this.visualizaciones = 0;
    }

    public void reproducir() {
        visualizaciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    @Override
    public String toString() {
        return titulo + " (visitas: " + visualizaciones + ")";
    }
}
