package clasificacion;

public class DatosGenerales {
    String comer;
    String dormir;
    String correr;
    String comunicarse;

    //Constructor
    public DatosGenerales(String comer, String dormir, String correr, String comunicarse) {
        this.comer = comer;
        this.dormir = dormir;
        this.correr = correr;
        this.comunicarse = comunicarse;
    }

    //Getter y setter
    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    public String getDormir() {
        return dormir;
    }

    public void setDormir(String dormir) {
        this.dormir = dormir;
    }

    public String getCorrer() {
        return correr;
    }

    public void setCorrer(String correr) {
        this.correr = correr;
    }

    public String getComunicarse() {
        return comunicarse;
    }

    public void setComunicarse(String comunicarse) {
        this.comunicarse = comunicarse;
    }
}
