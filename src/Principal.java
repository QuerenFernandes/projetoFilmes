import br.com.alura.projetofilmes.calculo.CalculadoraDeTempo;
import br.com.alura.projetofilmes.calculo.FiltroRecomendacao;
import br.com.alura.projetofilmes.modelos.Episodio;
import br.com.alura.projetofilmes.modelos.Filme;
import br.com.alura.projetofilmes.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Eragon");
        meuFilme.setAnoDeLancamento(2006);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setCategoriaDoFilme("Fantasia");


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(0);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        Serie serie = new Serie();
        serie.setNome("Cake Boss");
        serie.setAnoDeLancamento(2017);
        serie.setEpisodiosPorTemporada(8);
        serie.setTemporadas(10);
        serie.setMinutosPorTemporada(20);
        System.out.println("Duração para maratonar: " + serie.getNome() + ": " + serie.getDuracaoEmMinutos() + " minutos.");


        Filme outroFilme = new Filme();
        outroFilme.setNome("Senhor dos Aneis");
        outroFilme.setAnoDeLancamento(2000);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setCategoriaDoFilme("Fantasia");


        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(serie);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalDeVisualizacoes(500);

        filtro.filtra(serie);

    }
}
