package Collections.Map;

import java.util.*;

/* Dada os modelos de carros e seus respextivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6km/l
modelo = mobi - consumo = 16,1km/l
modelo = hb20 - consumo  = 14,5km/l
modelo kwid - consumo = 15,6km/l

 */
public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15,2km/l: ");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: "+carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba consumo do uno: "+carrosPopulares.get("uno"));

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExbida o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries =  carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente=entry.getKey();
                System.out.println("Modelo mais eficiênte: "+modeloMaisEficiente+" | "+consumoMaisEficiente+"km/l");
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+modeloMenosEficiente +" | "+consumoMenosEficiente+"km/l");
            }
        }

        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média de consumo deste dicionário de carros: "+(soma/carrosPopulares.size())+"km/l");

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l:");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("\nExbia o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares2);

        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();{
            if (true){
                System.out.println("Dicionário apagado!");
            }
        }

        System.out.println("\nConfira se o dicionário está vazio: ");
        carrosPopulares.isEmpty();{
            if (true){
                System.out.println("Sim está vazio");
            }
        }

    }
}
