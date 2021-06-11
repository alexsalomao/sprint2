package app;

public abstract class PasseSazonal extends Epass {
    private String chaveValida;


    public PasseSazonal() {


    }
    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }


}
