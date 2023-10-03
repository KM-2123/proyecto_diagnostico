package clasificacion;

public class Lobo {
    //variables
    int numCamada;
    String especieLobo;

    //Constructor
    public Lobo(int numCamada, String especieLobo) {
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    //Getter y setter
    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }
}
