public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    String categoriaDoFilme;

    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento do Filme: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
