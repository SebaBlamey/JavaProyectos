package Herencia;

public class Ramo {
    private String nombreRamo;
    private String profesorRamo;
    private String tipo; // Catedra o ayudantia
    private String bloqueClase;
    private String linkClase;

    public Ramo(String nombreRamo, String profesorRamo, String tipo, String bloqueClase, String linkClase) {
        this.nombreRamo = nombreRamo;
        this.profesorRamo = profesorRamo;
        this.tipo = tipo;
        this.bloqueClase = bloqueClase;
        this.linkClase = linkClase;
    }

    public String getNombreRamo() {
        return nombreRamo;
    }

    public void setNombreRamo(String nombreRamo) {
        this.nombreRamo = nombreRamo;
    }

    public String getProfesorRamo() {
        return profesorRamo;
    }

    public void setProfesorRamo(String profesorRamo) {
        this.profesorRamo = profesorRamo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBloqueClase() {
        return bloqueClase;
    }

    public void setBloqueClase(String bloqueClase) {
        this.bloqueClase = bloqueClase;
    }

    public String getLinkClase() {
        return linkClase;
    }

    public void setLinkClase(String linkClase) {
        this.linkClase = linkClase;
    }
}
