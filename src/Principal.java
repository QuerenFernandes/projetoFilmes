import br.com.alura.projetofilmes.modelos.Filme;

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
    }
}
