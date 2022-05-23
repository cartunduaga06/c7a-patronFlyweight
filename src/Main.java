public class Main {

    public static void main(String[] args) {

        final comidaFactory comida =new comidaFactory(); //se crea comidaFactory

        Comida hamburguesa  = comida.getComida("Comida Rapida");  // no hay necesiad de crear un nuevo objeto, comida factory crea el tipo de comida
        hamburguesa.setPrecio(10000);
        hamburguesa.setTieneLechuga(true);

        hamburguesa.descripcionDeLaComida();

        Comida perroCaliente = comida.getComida("Comida Rapida");
        perroCaliente.setTieneLechuga(false);
        perroCaliente.setPrecio(5000);

        perroCaliente.descripcionDeLaComida();
    }
}
