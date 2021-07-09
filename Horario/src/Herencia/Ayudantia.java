package Herencia;

public class Ayudantia extends Ramo {
    private String nombreAyudante;

    public Ayudantia(String nombreRamo, String profesorRamo, String tipo, String bloque, String linkClase, String nombreAyudante){
        super(nombreRamo, profesorRamo, tipo, bloque, linkClase);
        this.nombreAyudante = nombreAyudante;
    }

    public String getNombreAyudante() {
        return nombreAyudante;
    }

    public void setNombreAyudante(String nombreAyudante) {
        this.nombreAyudante = nombreAyudante;
    }
}
