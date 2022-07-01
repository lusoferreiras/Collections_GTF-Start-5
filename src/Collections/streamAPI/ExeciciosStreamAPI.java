package Collections.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExeciciosStreamAPI {
    public static <integer> void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9","6", "5");

     //   System.out.println("Imprima todos os elementos dessa lista de String: ");
     //   numerosAleatorios.stream().forEach(System.out::println);

     //   numerosAleatorios.forEach(System.out::println);

//        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//        Set<String> collectSet = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet());
//        System.out.println(collectSet.toString());
//
//        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros:");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
//                System.out.println(collectList.toString());


//        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista: ");
//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i ->(i %2 == 0 && i > 2))
//                .collect(Collectors.toList());
//        System.out.println(listParesMaioresQue2);

//        System.out.println("\nMostre a média dos números: ");
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(v -> System.out.println(v));

        System.out.println("\nRemova os valores ímpares: ");
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);

    }
}
