package Collections.List.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/*Dados as seguintes informações sbre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo episodio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = Nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = Nome: that '70s show, genero: comédia, tempoEpisodio: 25
 */
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>();{
            {
                minhasSeries.add(new Serie("GOT", "fantasia", 60));
                minhasSeries.add(new Serie("dark", "drama", 60));
                minhasSeries.add(new Serie("That 70's show", "comédia", 25));
            }};

        for (Serie serie: minhasSeries) System.out.println(serie.getNome()+
                " | "+serie.getGenero()+" | "+serie.getTempoEpisodio()+"min");

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>();{
            {
                minhasSeries1.add(new Serie("GOT", "fantasia", 60));
                minhasSeries1.add(new Serie("Dark", "drama", 60));
                minhasSeries1.add(new Serie("That 70's show", "comédia", 25));
            }};

        for (Serie serie: minhasSeries1) System.out.println(serie.getNome()+
                " | "+serie.getGenero()+" | "+serie.getTempoEpisodio()+"min");
    }
    }

class Serie{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "\nnome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
}