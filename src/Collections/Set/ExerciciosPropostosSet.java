package Collections.Set;

/*
- Crie um conjunto contendo as cores do arco-íris e:
    A. Exiba todas as cores uma abaixo da outra
    B. A quantidade de cores que o arco-íris tem
    C. Exiba as cores em ordem alfabética
    D. Exiba as cores na ordem inversa da que foi informada
    E. Exiba todas as cores que começam com a letra "v"
    F. Remova todas as cores que não começam com a letra
    G. Limpe o conjunto
    H. Confira se o conjunto está vazio

- Crie uma classe Linguagem Favorita que possua os atributos
  nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
  3 linguagens e faça um programa que ordene esse conjunto
  por:
    A. Odem de Inserção
    B. Ordem Natural(nome)
    C. IDE
    D. Ano de criação e nome
    E. Nome, ano de criação e IDE

    Ao final exiba as linguagens no console, um  abaixo do outro

 */

import java.util.*;

public class ExerciciosPropostosSet {

    public static void main(String[] args) {
        System.out.println("--\nArco Íris\n--");
        Set<String> arcoIris = new HashSet<>(Arrays.asList("verde", "vermelho", "azul", "amarelo", "roxo", "laranja", "preto"));

        System.out.println(arcoIris.toString());

        System.out.println("\n--Quantidade de cores--");
        System.out.println(arcoIris.size());

        System.out.println("\n--Ordem alfabética--");
        System.out.println(Collections.max(arcoIris));

        System.out.println("\n--Ordem inversa--");
        System.out.println(Collections.min(arcoIris));
    }
}



