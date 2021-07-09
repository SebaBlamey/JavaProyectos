package ListasClases;


import Herencia.Ramo;

public class listaRamos {
    private int max;
    private int cant;
    private Ramo[] lr;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public listaRamos(int max){
        this.max = max;
        cant = 0;
        lr = new Ramo[max];
    }
}
