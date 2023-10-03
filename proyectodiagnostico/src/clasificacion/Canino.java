package clasificacion;

public class Canino {

    //variables
    String color;
    float tamanoColmillo;

    //Constructor
    public Canino(String color, float tamanoColmillo) {
        this.color = color;
        this.tamanoColmillo = tamanoColmillo;
    }


    //Getter y setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanoColmillo() {
        return tamanoColmillo;
    }

    public void setTamanoColmillo(float tamanoColmillo) {
        this.tamanoColmillo = tamanoColmillo;
    }
}
