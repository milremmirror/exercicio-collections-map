import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class ExercicioMap {
    public static void main(String[] args) {
        /*
        Dado os modelos dos carros e seus respectivos consumos na estrada, faca:
        modelo = gol - consumo = 14,4 km/h
        modelo = uno - consumo = 15,6 km/h
        modelo = mobi - consumo = 16,1 km/h
        modelo = hb20 - consumo = 14,5 km/h
        modelo = kwid - consumo = 15,6 km/h
        * */



        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares);
        System.out.println();

        System.out.println("substitua o consumo do gol por 15,2 km/h");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("confira se o modelo tucson está no dicionário");
        System.out.println(carrosPopulares.containsKey("tucson"));
        System.out.println();

        System.out.println("Exiba o consumo do uno");
        System.out.println();

        System.out.println(carrosPopulares.get("uno"));
        System.out.println();
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println();

        System.out.println("Exiba os consumos dos carros");
        Collection<Double> values = carrosPopulares.values();
        System.out.println(values);
        System.out.println();
        
        System.out.println("Exiba o modelo mais economico e seu consumo");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry :  entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
            System.out.println(modeloMaisEficiente + ", " + consumoMaisEficiente);
        }
        System.out.println();

        System.out.println("Exiba o modelo menos economico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            String modeloMenosEficiente = "";
            if (entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();
            System.out.println(modeloMenosEficiente + ", " + consumoMenosEficiente);
        }
        System.out.println();
        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("exiba a média dos consumos deste dicionário");
        System.out.println(soma/carrosPopulares.size());
        System.out.println();


        System.out.println(carrosPopulares);
        System.out.println("remova os modelos com o consumo igual a 15.6");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println();


        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares1);
        System.out.println();

        System.out.println("Exiba o dicionário ordenado pelo modelo (chave)");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
            System.out.println(carrosPopulares2);
        System.out.println();

        System.out.println("Apague o dicionário de carros");
        carrosPopulares.clear();
        System.out.println();

        System.out.println("Confira se o dicionário está vazio");
        System.out.println(carrosPopulares.isEmpty());
    }

}
