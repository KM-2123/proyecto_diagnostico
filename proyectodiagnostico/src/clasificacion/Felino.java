package clasificacion;

public class Felino {

    //Constructor
    public Felino(float tamanoGarras, int velocidad) {
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }


    //Getter y setter
    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //variables
    float tamanoGarras;
    int velocidad;

}
