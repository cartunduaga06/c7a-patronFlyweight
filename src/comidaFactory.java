import java.util.HashMap;

public class comidaFactory {

    private static final HashMap<String, Comida> comidaMap = new HashMap();

    public static Comida getComida (String tipoComida){

        Comida comida = (Comida) comidaMap.get(tipoComida);
        if(comida == null){
            comida = new Comida (tipoComida);
            comidaMap.put(tipoComida, comida);
            System.out.println("creando objeto comida de tipo: " + tipoComida);
        }
        System.out.println("Recuperando Objecto de comida tipo: " + tipoComida);
        return comida;
    }

}
