package br.com.alura.projetofilmes.principal;

import br.com.alura.projetofilmes.modelos.Filme;
import br.com.alura.projetofilmes.modelos.Serie;
import br.com.alura.projetofilmes.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Eragon", 2006);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Senhor dos Aneis", 2000);
        outroFilme.avalia(10);
        Filme novoFilme = new Filme("Star Wars", 2003);
        novoFilme.avalia(6);
        Serie serie = new Serie("Cake Boss", 2017);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(novoFilme);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(serie);

        for (Titulo item: listaDeAssistidos) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Robert Downey Jr.");
        buscaPorArtista.add("Nicole Kidman");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Hugh Jackman");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação: " + buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println("Lista de títulos ordenados: " + listaDeAssistidos);

    }
}
