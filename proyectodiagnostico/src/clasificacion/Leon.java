package clasificacion;

public class Leon {
    //variable
    int numManada;
    float potenciaRudigidoDecible;

    //Constructor
    public Leon(int numManada, float potenciaRudigidoDecible) {
        this.numManada = numManada;
        this.potenciaRudigidoDecible = potenciaRudigidoDecible;
    }

    //getter y setter
    public int getNumManada() {
        return numManada;
    }

    public void setNumManada(int numManada) {
        this.numManada = numManada;
    }

    public float getPotenciaRudigidoDecible() {
        return potenciaRudigidoDecible;
    }

    public void setPotenciaRudigidoDecible(float potenciaRudigidoDecible) {
        this.potenciaRudigidoDecible = potenciaRudigidoDecible;
    }
}
