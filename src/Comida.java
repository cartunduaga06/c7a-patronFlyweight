public class Comida {
    private String  tipoComida;
    private int precio;
    private Boolean tieneLechuga;

    public Comida(String tipoComida) {
        this.tipoComida = tipoComida;

    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Boolean getTieneLechuga() {
        return tieneLechuga;
    }

    public void setTieneLechuga(Boolean tieneLechuga) {
        this.tieneLechuga = tieneLechuga;
    }

    public void descripcionDeLaComida(){
        System.out.println("Es una " + getTipoComida() + " que vale : " + getPrecio());
    }

}
